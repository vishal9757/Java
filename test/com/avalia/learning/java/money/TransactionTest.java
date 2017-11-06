/**
 * 
 */
package com.avalia.learning.java.money;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Vishal
 *
 */
public class TransactionTest {

	private ATM atm;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	@Test
	public void testWitdraw() {
		atm = new ATM();
		atm.add(CurrencyDenomination.D2000, 3);
		Transaction t = new Transaction();
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100, 0);
		expected.put(500, 0);
		expected.put(2000, 3);
		Map<Integer, Integer> actual = t.withdraw(6000, atm);
		assertEquals(expected, actual);
	}

	@Test
	public void testWitdraw1() {
		atm = new ATM();
		atm.add(CurrencyDenomination.D100, 100);
		atm.add(CurrencyDenomination.D500, 4);
		atm.add(CurrencyDenomination.D2000, 3);
		Transaction t = new Transaction();
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100, 5);
		expected.put(500, 3);
		expected.put(2000, 2);
		Map<Integer, Integer> actual = t.withdraw(6000, atm);
		assertEquals(expected, actual);
	}

	@Test
	public void testWitdraw2() {
		atm = new ATM();
		atm.add(CurrencyDenomination.D100, 100);
		atm.add(CurrencyDenomination.D500, 2);
		atm.add(CurrencyDenomination.D2000, 3);
		Transaction t = new Transaction();
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100, 10);
		expected.put(500, 2);
		expected.put(2000, 2);
		Map<Integer, Integer> actual = t.withdraw(6000, atm);
		assertEquals(expected, actual);
	}

	@Test
	public void testWitdraw3() {
		atm = new ATM();
		atm.add(CurrencyDenomination.D100, 100);
		Transaction t = new Transaction();
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100, 0);
		expected.put(500, 0);
		expected.put(2000, 0);
		Map<Integer, Integer> actual = t.withdraw(6000, atm);
		assertEquals(expected, actual);
	}

	@Test
	public void testWitdraw4() {
		atm = new ATM();
		atm.add(CurrencyDenomination.D100, 100);
		Transaction t = new Transaction();
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100, 0);
		expected.put(500, 0);
		expected.put(2000, 0);
		Map<Integer, Integer> actual = t.withdraw(5000000, atm);
		assertEquals(expected, actual);
	}

	@Test
	public void testWitdraw5() {
		atm = new ATM();
		atm.add(CurrencyDenomination.D100, 100);
		Transaction t = new Transaction();
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100, 0);
		expected.put(500, 0);
		expected.put(2000, 0);
		Map<Integer, Integer> actual = t.withdraw(-20000, atm);
		assertEquals(expected, actual);
	}

}
