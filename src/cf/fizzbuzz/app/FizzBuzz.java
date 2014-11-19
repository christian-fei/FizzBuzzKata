package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if( isMultipleOfThree(number) ) return "Fizz";
		return String.valueOf(number);
	}

	private boolean isMultipleOfThree(int number) {
		return number%3 == 0 && number>0;
	}

}
