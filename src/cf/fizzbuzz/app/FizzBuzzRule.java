package cf.fizzbuzz.app;

public class FizzBuzzRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return number % 15 == 0;
	}

	@Override
	public String apply() {
		return "FizzBuzz";
	}

}
