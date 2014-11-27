package cf.fizzbuzz.app;

public class FizzBuzz {

	public static String getExclamationFor(int number) {
		if (15 == number)
			return "FizzBuzz";
		if (number%3 == 0 && number > 0)
			return "Fizz";
		if (number%5 == 0 && number > 0)
			return "Buzz";
		return Integer.toString(number);
	}

}
