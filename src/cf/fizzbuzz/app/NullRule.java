package cf.fizzbuzz.app;

public class NullRule implements Rule {

	@Override
	public boolean canHandle(int number) {
		return number == 0;
	}

	@Override
	public String apply() {
		return "0";
	}

}
