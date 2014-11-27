package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if (isZero(number))
			return "0";
		if (isBuzz(number))
			return "Buzz";
		if (isFizz(number))
			return "Fizz";
		return Integer.toString(number);
	}
	
	private boolean isBuzz(int number) {
		return number == 5;
	}
	
	private boolean isFizz(int number) {
		return number % 3 == 0;
	}

	private boolean isZero(int number) {
		return number == 0;
	}

}
