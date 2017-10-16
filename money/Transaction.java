package com.avalia.learning.java.money;

import java.util.HashMap;
import java.util.Map;

public class Transaction {

	public Map<Integer, Integer> withdraw(int amount, ATM atm) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(100, 0);
		map.put(500, 0);
		map.put(2000, 0);

		if (amount <= atm.dispensableAmount()&& amount%100==0) {
			return operation(amount, atm, map);
		} else {
			System.out.println("Invalid amount");
			System.out.println(map.entrySet());
			System.out.println("After transaction vault balance" + atm.map.entrySet());
			return map;
		}

	}

	private Map<Integer, Integer> operation(int amount, ATM atm, Map<Integer, Integer> map) {
		int count = 0;
		while (amount > 0) {
			if (checkBal(amount, atm)) {
				System.out.println("Insufficient fund");
				clearBal(atm, map);
				break;
			} else if (count > 40) {
				System.out.println("Dispatched notes exceed limited number");
				clearBal(atm, map);
				break;
			} else if (shouldWithdraw2000(amount, atm, map)) {
				atm.withdraw(CurrencyDenomination.D2000, 1);
				map.put(2000, map.get(2000) + 1);
				amount = amount - 2000;
				count++;
			} else if (shouldWithdraw500(amount, atm, map)) {
				atm.withdraw(CurrencyDenomination.D500, 1);
				map.put(500, map.get(500) + 1);
				amount = amount - 500;
				count++;
			} else if (shouldWithdraw100(amount, atm, map)) {
				atm.withdraw(CurrencyDenomination.D100, 1);
				map.put(100, map.get(100) + 1);
				amount = amount - 100;
				count++;
			}
		}
		System.out.println(map.entrySet());
		System.out.println("After transaction vault balance" + atm.map.entrySet());
		return map;

	}

	private void clearBal(ATM atm, Map<Integer, Integer> map) {
		atm.add(CurrencyDenomination.D2000, map.get(2000));
		atm.add(CurrencyDenomination.D500, map.get(500));
		atm.add(CurrencyDenomination.D100, map.get(100));
		map.put(2000, 0);
		map.put(500, 0);
		map.put(100, 0);
	}

	private boolean checkBal(int amount, ATM atm) {
		return atm.check(CurrencyDenomination.D2000) == 0 && atm.check(CurrencyDenomination.D500) == 0
				&& atm.check(CurrencyDenomination.D100) == 0 && amount > 0;
	}

	private boolean shouldWithdraw100(int amount, ATM atm, Map<Integer, Integer> map) {
		return amount >= 100 && atm.check(CurrencyDenomination.D100) > 0;
	}

	private boolean shouldWithdraw500(int amount, ATM atm, Map<Integer, Integer> map) {
		return amount > 500 && atm.check(CurrencyDenomination.D500) > 0;
	}

	private boolean shouldWithdraw2000(int amount, ATM atm, Map<Integer, Integer> map) {
		return (amount > 2000 && atm.check(CurrencyDenomination.D2000) > 0)
				|| (amount == 2000 && atm.check(CurrencyDenomination.D500) == 0
						&& atm.check(CurrencyDenomination.D100) == 0 && atm.check(CurrencyDenomination.D2000) > 0);
	}
}
