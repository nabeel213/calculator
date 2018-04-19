package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {

	private Multiply multi;
	@Test
	public void testAdd() {
		multi = new Multiply();
		int expectedValue = 4;
		int actualValue = multi.multiplyNums(2, 2);
		Assert.assertEquals(expectedValue, actualValue);
		
	}

}
