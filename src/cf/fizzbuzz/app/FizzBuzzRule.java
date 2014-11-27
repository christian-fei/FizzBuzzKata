package cf.fizzbuzz.app;

public class FizzBuzzRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return number%15 == 0 && number > 0;
	}

	@Override
	public String evaluate(int number) {
		return "FizzBuzz";
	}

}
