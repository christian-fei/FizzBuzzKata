package cf.fizzbuzz.test;

import static org.junit.Assert.*;

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
		assertEquals("2", FizzBuzz.getExclamationFor(2));
		assertEquals("4", FizzBuzz.getExclamationFor(4));
	}

	@Test
	public void getExclamationFor_number3_returnsFizz() {
		assertEquals("Fizz", FizzBuzz.getExclamationFor(3));
	}
	
	@Test
	public void getExclamationFor_number5_returnsBuzz() {
		assertEquals("Buzz", FizzBuzz.getExclamationFor(5));
	}
	

}
