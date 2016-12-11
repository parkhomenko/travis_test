package com.travis.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void additionTest() {
		int result = Calculator.addition(3, 5);
		assertEquals(result, 8);
	}
}