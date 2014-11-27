package cf.fizzbuzz.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cf.fizzbuzz.app.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void test() {
		assertEquals("0", FizzBuzz.getExclamationFor(0));
	}

}
