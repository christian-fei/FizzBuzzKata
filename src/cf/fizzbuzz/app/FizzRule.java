package cf.fizzbuzz.app;

public class FizzRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return number%3 == 0 && number > 0;
	}

	@Override
	public String evaluate(int number) {
		return "Fizz";
	}

}
