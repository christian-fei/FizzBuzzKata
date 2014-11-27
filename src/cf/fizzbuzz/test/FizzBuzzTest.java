package cf.fizzbuzz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cf.fizzbuzz.app.FizzBuzz;
import cf.fizzbuzz.app.FizzBuzzFactory;

public class FizzBuzzTest {

	private FizzBuzz fb;

	@Before
	public void setUp() throws Exception {
		fb = FizzBuzzFactory.makeFizzBuzz();
	}

	@Test
	public void getExclamationFor_number0_returns0() {
		assertEquals("0", fb.getExclamationFor(0));
	}

	@Test
	public void getExclamationFor_simpleNumbers_returnsNumber() {
		assertEquals("1", fb.getExclamationFor(1));
		assertEquals("2", fb.getExclamationFor(2));
		assertEquals("4", fb.getExclamationFor(4));
	}

	@Test
	public void getExclamationFor_multiplesOf3_returnsFizz() {
		assertEquals("Fizz", fb.getExclamationFor(3));
		assertEquals("Fizz", fb.getExclamationFor(6));
	}

	@Test
	public void getExclamationFor_multiplesOf5_returnsBuzz() {
		assertEquals("Buzz", fb.getExclamationFor(5));
		assertEquals("Buzz", fb.getExclamationFor(10));
	}

	@Test
	public void getExclamationFor_multiplesOf15_returnsFizzBuzz() {
		assertEquals("FizzBuzz", fb.getExclamationFor(15));
		assertEquals("FizzBuzz", fb.getExclamationFor(30));
	}

}
