package Annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExamples {

	int x = 5, y = 10, z;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all the Classes");
	}

	@BeforeEach
	void setUp() {
		System.out.println("Before each test cases");
	}

	@Test
	public void addition() {
		z = x + y;
		assertEquals(15, z);
		System.out.println("Addition value= " + z);
	}

	@Test
	public void multiplication() {
		z = x * y;
		assertEquals(50, z);
		System.out.println("Multiplication value= " + z);
	}

	@Ignore
	public void ignoreMessage() throws Exception {
		String info = "JUnit Annotations";
		assertEquals(info, "JUnit Annotations");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test casses");
	}

	@AfterAll
	static void teatDownAfterClass() throws Exception {
		System.out.println("After all the Classes");
	}
}
