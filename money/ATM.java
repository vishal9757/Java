package com.avalia.learning.java.money;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ATM {
	public static final int MAX_DISPENSABLE_NOTES = 40;
	Map<CurrencyDenomination, Integer> map = new HashMap<>();

	public int check(CurrencyDenomination cd) {
		Integer existingCount = map.get(cd);
		if (existingCount == null) {
			return 0;
		}
		return existingCount;
	}

	//add the note in vault
	public void add(CurrencyDenomination cd, int count) {
		Integer existingCount = map.get(cd);
		if (existingCount == null) {
			existingCount = 0;
		}
		map.put(cd, existingCount + count);
	}

	//reduces the number of note by count value
	public void withdraw(CurrencyDenomination cd, int count) {
		Integer existingCount = map.get(cd);
		if (existingCount == null) {
			existingCount = 0;
		}
		map.put(cd, existingCount - count);
	}

	// returns the total balance in the atm
	private int currentBalance() {
		int balance = 0;
		for (Entry<CurrencyDenomination, Integer> e : map.entrySet()) {
			balance += e.getKey().currencyValue() * e.getValue();
		}
		return balance;
	}

	//returns the max amount that can be withdrawn at a time
	private int maxAmount() {
		CurrencyDenomination[] values = CurrencyDenomination.values();
		Arrays.sort(values, new Comparator<CurrencyDenomination>() {

			@Override
			public int compare(CurrencyDenomination o1, CurrencyDenomination o2) {
				return o2.currencyValue() - o1.currencyValue();
			}
		});
		return values[0].currencyValue() * MAX_DISPENSABLE_NOTES;
	}
	
	//returns the amount user can withdraw
	public int dispensableAmount(){
		return Math.min(currentBalance(), maxAmount());
	}

}
