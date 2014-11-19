package cf.fizzbuzz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cf.fizzbuzz.app.FizzBuzz;

public class FizzBuzzTest {

	private FizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	public void evaluate0_returns0() {
		assertEquals("0", fb.evaluate(0));
	}
	
	@Test
	public void evaluate3_returnsFizz() throws Exception {
		assertEquals("Fizz", fb.evaluate(3));
	}
	
	@Test
	public void evaluateMultipleOfThrees_returnsFizz() throws Exception {
		assertEquals("Fizz", fb.evaluate(6));
		assertEquals("Fizz", fb.evaluate(9));
		assertEquals("Fizz", fb.evaluate(12));
	}

	@Test
	public void evaluateMultipleOfFive_returnsBuzz() throws Exception {
		assertEquals("Buzz", fb.evaluate(5));
		assertEquals("Buzz", fb.evaluate(10));
		assertEquals("Buzz", fb.evaluate(15));
		assertEquals("Buzz", fb.evaluate(20));
	}
}
