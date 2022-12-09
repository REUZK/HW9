import main.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult= 12;
		int actualResult= calculator.add(8,4);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult= 2;
		int actualResult= calculator.sub(7,5);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult= 48;
		int actualResult= calculator.multiply(8,6);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		float expectedResult= 10;
		float actualResult= calculator.divide(20,2);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		Throwable exception = assertThrows(ArithmeticException.class, () -> calculator.divide(20, 0));
		assertEquals("ZeroDivisionError", exception.getMessage());
	}
}
