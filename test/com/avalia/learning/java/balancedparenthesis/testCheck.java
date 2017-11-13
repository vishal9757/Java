package com.avalia.learning.java.balancedparenthesis;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testCheck {
	BalancedParenthesis b;

	@Before
	public void setUp() throws Exception {
		b = new BalancedParenthesis();
	}

	@After
	public void tearDown() throws Exception {
		b = null;
	}

	@Test
	public void testCheck() {
		assertEquals(true, b.check("<>{}<{}>"));
		assertEquals(false, b.check("<>{<{}>"));
		assertEquals(false, b.check("<>{<{vishal}>"));
		assertEquals(true, b.check("<>{vishal}<{}>"));
		assertEquals(false, b.check("<>{}<{(<)<>>}>"));
	}

}
