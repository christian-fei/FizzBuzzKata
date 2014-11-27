package cf.fizzbuzz.app;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzFactory {
	
	static List<Rule> rules = new ArrayList<Rule>(){{
		add(new NullRule());
		add(new FizzBuzzRule());
	}};
	
	public static FizzBuzz get() {
		
		return new FizzBuzz(rules);
	}

	
}