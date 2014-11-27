package cf.fizzbuzz.app;

import java.util.List;

public class FizzBuzz {

	private List<Rule> rules;

	public FizzBuzz(List<Rule> rules) {
		this.rules = rules;
	}

	public String evaluate(int number) {
		for (Rule rule : rules) {
			if( rule.canHandle(number))
				return rule.apply();
		}
		if (isBuzz(number))
			return "Buzz";
		if (isFizz(number))
			return "Fizz";
		return Integer.toString(number);
	}

	private boolean isFizzBuzz(int number) {
		return number % 15 == 0;
	}

	private boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private boolean isFizz(int number) {
		return number % 3 == 0;
	}

	private boolean isZero(int number) {
		return number == 0;
	}

}
