package cf.fizzbuzz.app;

public interface Rule {
	boolean canHandle(int number);
	String evaluate(int number);
}
