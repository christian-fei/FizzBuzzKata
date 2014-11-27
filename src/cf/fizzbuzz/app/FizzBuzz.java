package cf.fizzbuzz.app;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	private static List<Rule> rules = new ArrayList<Rule>() {{
		add(new FizzRule());
		add(new BuzzRule());
		add(new SimpleNumberRule());
	}};
	
	public static String getExclamationFor(int number) {
		if (number%15 == 0 && number > 0)
			return "FizzBuzz";
		for (Rule rule : rules) {
			if(rule.canHandle(number))
				return rule.evaluate(number);
		}
		return null;
	}

}
