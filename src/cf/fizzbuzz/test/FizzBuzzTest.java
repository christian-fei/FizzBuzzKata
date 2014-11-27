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
	
	@Test
	public void evaluate_number3_returnsFizz() throws Exception {
		assertEquals("Fizz",fb.evaluate(3));
	}

	@Test
	public void evaluate_multipleOf3_returnsFizz() throws Exception {
		assertEquals("Fizz",fb.evaluate(6));
		assertEquals("Fizz",fb.evaluate(9));
	}
	
	@Test
	public void evaluate_number5_returnsBuzz() throws Exception {
		assertEquals("Buzz",fb.evaluate(5));
	}

	@Test
	public void evaluate_multipleOf5_returnsBuzz() throws Exception {
		assertEquals("Buzz",fb.evaluate(5));
		assertEquals("Buzz",fb.evaluate(10));
	}
	
}
