package Asseretions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SampliAssertion {

	@Test
	public void sampleAssertion() {
		int val1=5, val2=6;
		String str1= new String("welcome");
		String str2= new String("welcome");
		String str3= null;
		String str4= "welcome";
		String str5= "welcome";
		String expectedArray[]= {"one","two","three"};
		String resultArray[]= {"one","two","three"};
		
		assertEquals(str1,str2);
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4,str5);
		assertNotSame(str4, str3);
		assertArrayEquals(expectedArray, resultArray);	
	}
}