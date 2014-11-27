package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if (isFizz(number))
			return "Fizz";
		return Integer.toString(number);
	}
	
	private boolean isFizz(int number) {
		return number == 3;
	}

}
