package lesson9.labs.prob10a;

import java.util.*;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(someSimpleIsTrue(list));
	}
	
	public boolean someSimpleIsTrue2(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	}

	public static boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream().map(x-> x.flag).reduce(false,(x,y)-> x || y);
	}

}
