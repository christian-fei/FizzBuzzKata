package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if( isMultipleOfFive(number) ) return "Buzz";
		if( isMultipleOfThree(number) ) return "Fizz";
		return String.valueOf(number);
	}

	private boolean isMultipleOfFive(int number) {
		return number%5 == 0 && number>0;
	}

	private boolean isMultipleOfThree(int number) {
		return number%3 == 0 && number>0;
	}

}
