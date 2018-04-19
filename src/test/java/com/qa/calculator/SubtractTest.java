package com.qa.calculator;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	private Subtractor subtractor;
	@Test
	public void test() {
		subtractor = new Subtractor();
		int expectedValue = 2;
		int actualValue = subtractor.sub(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}
}
