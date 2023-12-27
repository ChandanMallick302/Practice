package TestSuite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SuiteTest1 {
	int a = 10, b = 10, c;

	@Test
	public void addition() {
		c = a + b;
		assertEquals(20, c);
		System.out.println("Addition =" + c);
	}
}
