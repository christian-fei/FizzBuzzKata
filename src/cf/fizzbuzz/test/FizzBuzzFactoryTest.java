package cf.fizzbuzz.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cf.fizzbuzz.app.BuzzRule;
import cf.fizzbuzz.app.FizzBuzz;
import cf.fizzbuzz.app.FizzBuzzFactory;
import cf.fizzbuzz.app.FizzBuzzRule;
import cf.fizzbuzz.app.FizzRule;
import cf.fizzbuzz.app.Rule;
import cf.fizzbuzz.app.SimpleNumberRule;

public class FizzBuzzFactoryTest {

	@Test
	public void makeFizzBuzz_createsFizzBuzzInstance_withDefinedSetOfRules()
			throws Exception {
		FizzBuzz fb = FizzBuzzFactory.makeFizzBuzz();
		List<Rule> actualRules = fb.getRules();
		List<Rule> expectedRules = new ArrayList<Rule>() {
			{
				add(new FizzBuzzRule());
				add(new BuzzRule());
				add(new FizzRule());
				add(new SimpleNumberRule());
			}
		};
		for (int index = 0; index < expectedRules.size(); index++) {
			assertEquals(expectedRules.get(index).getClass(),
					actualRules.get(index).getClass());
		}
	}
}
