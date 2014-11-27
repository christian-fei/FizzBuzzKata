package cf.fizzbuzz.app;

import java.util.List;

public class FizzBuzz {
	
	private List<Rule> rules;

	public FizzBuzz(List<Rule> rules) {
		this.rules = rules;
	}

	public String getExclamationFor(int number) {
		for (Rule rule : rules) {
			if(rule.canHandle(number))
				return rule.evaluate(number);
		}
		return null;
	}

	public List<Rule> getRules() {
		return rules;
	}
	
}
