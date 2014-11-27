package cf.fizzbuzz.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cf.fizzbuzz.app.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void getExclamationFor_number0_returns0() {
		assertEquals("0", FizzBuzz.getExclamationFor(0));
	}
	
	@Test
	public void getExclamationFor_simpleNumbers_returnsNumber() {
		assertEquals("1", FizzBuzz.getExclamationFor(1));
	}
	
	

}
