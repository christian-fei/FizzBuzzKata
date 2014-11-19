package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if (isZero(number))
			return String.valueOf(number);
		if (isMultipleOfFifteen(number))
			return "FizzBuzz";
		if (isMultipleOfFive(number))
			return "Buzz";
		if (isMultipleOfThree(number))
			return "Fizz";
		return String.valueOf(number);
	}

	private boolean isZero(int number) {
		return 0 == number;
	}

	private boolean isMultipleOfFifteen(int number) {
		return number % 15 == 0;
	}

	private boolean isMultipleOfFive(int number) {
		return number % 5 == 0;
	}

	private boolean isMultipleOfThree(int number) {
		return number % 3 == 0;
	}

}
