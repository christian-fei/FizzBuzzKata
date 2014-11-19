package cf.fizzbuzz.app;

public class FizzBuzz {

	public String evaluate(int number) {
		if( number%3 == 0 && number>0 ) return "Fizz";
		return String.valueOf(number);
	}

}
