package ExceptionTest;

import org.junit.Test;

public class Test1 {

	@Test(expected = ArithmeticException.class )
	public void testPrint() {
		System.out.println("Inside testPringMessage");
		TestMessage.print();
	}
}
