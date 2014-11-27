package cf.fizzbuzz.app;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzFactory {

	private static List<Rule> rules = new ArrayList<Rule>() {
		{
			add(new FizzBuzzRule());
			add(new BuzzRule());
			add(new FizzRule());
			add(new SimpleNumberRule());
		}
	};

	public static FizzBuzz makeFizzBuzz() {
		return new FizzBuzz(rules);
	}

}
