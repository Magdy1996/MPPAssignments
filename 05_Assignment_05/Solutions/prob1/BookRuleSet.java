package lesson5.labs.prob1.rulesets;

import java.awt.Component;

//import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {
	private BookWindow Book;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		Book = (BookWindow)  ob;
		nonempty();
		Isbnnumeric();
		Isbnconditions();
		Pricefloatingvalidate();
		validatePricenumber();

	}

	private void nonempty() throws RuleException{
		if(Book.getPriceValue().trim().isEmpty() ||
				Book.getIsbnValue().trim().isEmpty()  ||
				Book.getTitleValue() .trim().isEmpty()
		)
			throw new RuleException("All fields must be non-empty!");
	}

	private void Isbnnumeric() throws RuleException{
		String val = Book.getIsbnValue().trim();
		try {
			Integer.parseInt(val);
			//val is numeric
		} catch(NumberFormatException e) {
			throw new RuleException("Isbn must be numeric");
		}
		if(val.length() != 10 && val.length() != 13)
			throw new RuleException("Isbn must have 10 or 13 digits");
	}

	private void Isbnconditions() throws RuleException{
		String val = Book.getIsbnValue().trim();
		if(val.length() == 10 )
		{
			if( !(val.charAt(0) == '1' || val.charAt(0) == '0'))
			{
				throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1");
			}
		}

		if(val.length() == 3 )
		{
			if( !(val.startsWith("978") || val.startsWith("979")))
			{
				throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979 ");
			}
		}

		if(val.length() != 10 && val.length() != 13)
			throw new RuleException("Isbn must have 10 or 13 digits");
	}

	public void Pricefloatingvalidate() throws RuleException {
		String price = Book.getPriceValue();
		if (!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places.");
		}
	}

	public void validatePricenumber() throws RuleException {
		double price = Double.parseDouble(Book.getPriceValue());
		if (price <= 0.49) {
			throw new RuleException("Price must be greater than 0.49.");
		}
	}



}
