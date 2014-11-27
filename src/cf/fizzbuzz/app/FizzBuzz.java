package cf.fizzbuzz.app;

public class FizzBuzz {

	public static String getExclamationFor(int number) {
		if (5 == number)
			return "Buzz";
		if (15 == number)
			return "FizzBuzz";
		if (number%3 == 0 && number > 0)
			return "Fizz";
		return Integer.toString(number);
	}

}
