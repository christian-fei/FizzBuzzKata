package cf.fizzbuzz.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cf.fizzbuzz.app.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void evaluate_number0_returns0() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("0",fb.evaluate(0));
	}

}
