package com.avalia.learning.java.miniorange;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountTest {
	private MagicalString ms;

	@Before
	public void setUp() throws Exception {
		ms = new MagicalString();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testCount1() {
		assertEquals(10, ms.count("aeiaaioooaauuaeiou"));
		assertEquals(0, ms.count("aeiaaioooaa"));
		assertEquals(6, ms.count("aeaeiou"));
		assertEquals(6, ms.count("aeuiouoieaaeiou"));
		assertEquals(0, ms.count("aeiuooieaaei"));
		assertEquals(0, ms.count("aeio"));
		assertEquals(0, ms.count("aeuio"));
		assertEquals(12, ms.count("aeiaeeeeeeiouuu"));
		assertEquals(12, ms.count("eiaeeeeeeiouuu"));
		assertEquals(7, ms.count("aeaaeiou"));
	}

}
