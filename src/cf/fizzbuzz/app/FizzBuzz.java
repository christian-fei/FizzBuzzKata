package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if (isZero(number))
			return "0";
		if (isFizzBuzz(number))
			return "FizzBuzz";
		if (isBuzz(number))
			return "Buzz";
		if (isFizz(number))
			return "Fizz";
		return Integer.toString(number);
	}

	private boolean isFizzBuzz(int number) {
		return number % 15 == 0;
	}

	private boolean isBuzz(int number) {
		return number % 5 == 0;
	}

	private boolean isFizz(int number) {
		return number % 3 == 0;
	}

	private boolean isZero(int number) {
		return number == 0;
	}

}
