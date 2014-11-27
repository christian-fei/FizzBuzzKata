package cf.fizzbuzz.app;

public class NullRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return true;
	}

	@Override
	public String evaluate(int number) {
		return Integer.toString(number);
	}

}
