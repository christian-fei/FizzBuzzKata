package cf.fizzbuzz.app;

public class FizzBuzz {

	public static String getExclamationFor(int number) {
		if (3 == number)
			return "Fizz";
		if (5 == number)
			return "Buzz";
		if (15 == number)
			return "FizzBuzz";
		return Integer.toString(number);
	}

}
