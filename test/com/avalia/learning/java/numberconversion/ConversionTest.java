package com.avalia.learning.java.numberconversion;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConversionTest {
	private NumberConversion nc;

	@Before
	public void setUp() throws Exception {
		nc = new NumberConversion();
	}

	@After
	public void tearDown() throws Exception {
		nc = null;
	}

	@Test
	public void testConvertNumber() {
		assertEquals("Eighty Four", nc.convert(84));
		assertEquals("Ninety Thousand Nine", nc.convert(90009));
		assertEquals("Ninety Thousand", nc.convert(90000));
		assertEquals("Ten Thousand", nc.convert(10000));
		assertEquals("Ten Thousand One Hundred One", nc.convert(10101));
		assertEquals("One Lakh", nc.convert(100000));
		assertEquals("One Lakh One Thousand Eleven", nc.convert(101011));
		assertEquals("Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", nc.convert(9999999));
		assertEquals("Ninety Lakh Nine", nc.convert(9000009));
		assertEquals("One Crore", nc.convert(10000000));
		assertEquals("Nine Crore One Lakh One Thousand Eleven", nc.convert(90101011));
		assertEquals("Ninety Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", nc.convert(999999999));
		assertEquals("Ninety Lakh Nine", nc.convert(9000009));

	}
	
	@Test
	public void testConvertNumber1() {
		assertEquals("Eighty Four", nc.convert1(84));
		assertEquals("Ninety Thousand Nine", nc.convert1(90009));
		assertEquals("Ninety Thousand", nc.convert1(90000));
		assertEquals("Ten Thousand", nc.convert1(10000));
		assertEquals("Ten Thousand One Hundred One", nc.convert1(10101));
		assertEquals("One Lakh", nc.convert1(100000));
		assertEquals("One Lakh One Thousand Eleven", nc.convert1(101011));
		assertEquals("Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", nc.convert1(9999999));
		assertEquals("Ninety Lakh Nine", nc.convert1(9000009));
		assertEquals("One Crore", nc.convert1(10000000));
		assertEquals("Nine Crore One Lakh One Thousand Eleven", nc.convert1(90101011));
		assertEquals("Ninety Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", nc.convert1(999999999));
		assertEquals("Ninety Lakh Nine", nc.convert1(9000009));

	}

}
