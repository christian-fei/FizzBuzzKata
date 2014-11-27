package cf.fizzbuzz.app;

public class FizzBuzz {

	public static String getExclamationFor(int number) {
		if (number%15 == 0 && number > 0)
			return "FizzBuzz";
		if (number%5 == 0 && number > 0)
			return "Buzz";
		if (number%3 == 0 && number > 0)
			return "Fizz";
		return Integer.toString(number);
	}

}
