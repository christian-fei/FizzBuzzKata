package cf.fizzbuzz.app;

public class BuzzRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return number%5 == 0 && number > 0;
	}

	@Override
	public String evaluate(int number) {
		return "Buzz";
	}

}
