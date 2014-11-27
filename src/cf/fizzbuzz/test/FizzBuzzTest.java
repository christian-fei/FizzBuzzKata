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
	public void evaluate_number0_returns0() throws Exception {
		assertEquals("0",fb.evaluate(0));
	}

	@Test
	public void evaluate_number1_returns1() throws Exception {
		assertEquals("1",fb.evaluate(1));		
	}
	
}
