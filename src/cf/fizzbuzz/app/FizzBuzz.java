package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if (isZero(number))
			return "0";
		if (isFizz(number))
			return "Fizz";
		return Integer.toString(number);
	}
	
	private boolean isZero(int number) {
		return number == 0;
	}

	private boolean isFizz(int number) {
		return number % 3 == 0;
	}

}
