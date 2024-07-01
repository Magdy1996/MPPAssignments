package lesson5.labs.prob1.rulesets;

import lesson5.labs.prob1.gui.BookWindow;
import lesson5.labs.prob1.gui.CDWindow;

import java.awt.Component;

//import lesson5.labsolns.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cd;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cd = (CDWindow)  ob;
		nonEmptyFieldsRule();
		priceFormatRule();
		priceValueRule();
	}

	private void nonEmptyFieldsRule() throws RuleException {
		if (cd.getTitleValue().isEmpty() || cd.getArtistValue().isEmpty() || cd.getPriceValue().isEmpty()) {
			throw new RuleException("All fields must be non-empty.");
		}
	}

	private void priceFormatRule() throws RuleException {
		String price = cd.getPriceValue();
		if (!price.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with two decimal places.");
		}
	}

	private void priceValueRule() throws RuleException {
		double price = Double.parseDouble(cd.getPriceValue());
		if (price <= 0.49) {
			throw new RuleException("Price must be greater than 0.49.");
		}
	}
}
