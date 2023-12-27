package TestSuite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class SuiteTest2 {
	int a = 10, b = 10, c;

	@Test
	public void multiplication() {
		c = a * b;
		assertEquals(100, c);
		System.out.println("Multiplication = " + c);
	}
}