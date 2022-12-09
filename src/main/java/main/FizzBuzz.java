package main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		if (number % 5 == 0 && number % 7 != 0) {
			return "Fizz";
		}
		else if (number % 5 == 0 && number % 7 == 0) {
			return "FizzBuzz";
		}
		else if (number % 5 != 0 && number % 7 == 0) {
			return "Buzz";
		}

		return "No Fizz or Buzz";
	}
}
