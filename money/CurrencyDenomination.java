package com.avalia.learning.java.money;

// vault
public enum CurrencyDenomination {
	D100 {
		@Override
		public int currencyValue() {
			return 100;
		}
	},
	D500 {
		@Override
		public int currencyValue() {
			return 500;
		}
	},
	D2000 {
		@Override
		public int currencyValue() {
			return 2000;
			
		}
	};

	public int currencyValue() {
		return 0;
	}
}
