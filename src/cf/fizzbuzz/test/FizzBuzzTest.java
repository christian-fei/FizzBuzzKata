package cf.fizzbuzz.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cf.fizzbuzz.app.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void number0_returns0() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("0",fb.evaluate(0));
	}
	
	@Test
	public void number1_returns1() throws Exception {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1",fb.evaluate(1));		
	}

}
