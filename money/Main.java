package com.avalia.learning.java.money;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Transaction t = new Transaction();
		ATM n = new ATM();

		n.add(CurrencyDenomination.D2000, 0);
		n.add(CurrencyDenomination.D500, 1);
		n.add(CurrencyDenomination.D100, 100);
		System.out.println(n.dispensableAmount());
		System.out.println("Initial vault balance->" + n.map.entrySet());
		// t.withdraw(10000, n);
		// t.withdraw(10000, n1);
		Map<Integer, Integer> denomination = new HashMap<>();
		// t.withdraw(16000, n);
		denomination = t.withdraw(10000, n);
		// for (Entry<Integer, Integer> ent : denomination.entrySet()) {
		// System.out.println(ent.getKey() + "->" + ent.getValue());
		// }
		// System.out.println("Notes given to user->"+denomination.entrySet());

	}

}
