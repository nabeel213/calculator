package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

	private Division div;
	
	@Test
	public void test() {
		div = new Division();
		
		int expectedValue = 2;
		int actualValue = div.divide(4, 2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
