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

}
