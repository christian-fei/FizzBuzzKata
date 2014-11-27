package cf.fizzbuzz.app;

public class BuzzRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return number % 5 == 0;
	}

	@Override
	public String apply() {
		return "Buzz";
	}

}
