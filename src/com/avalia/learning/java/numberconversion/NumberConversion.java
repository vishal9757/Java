package com.avalia.learning.java.numberconversion;

import java.util.HashMap;
import java.util.Map;

public class NumberConversion {
	private Map<Integer, String> unitmap = new HashMap<>();

	private Map<Integer, String> digitPlace = new HashMap<>();

	public void initMap() {
		unitmap.put(1, "One");
		unitmap.put(2, "Two");
		unitmap.put(3, "Three");
		unitmap.put(4, "Four");
		unitmap.put(5, "Five");
		unitmap.put(6, "Six");
		unitmap.put(7, "Seven");
		unitmap.put(8, "Eight");
		unitmap.put(9, "Nine");
		unitmap.put(10, "Ten");
		unitmap.put(11, "Eleven");
		unitmap.put(12, "Twelve");
		unitmap.put(13, "Thirteen");
		unitmap.put(14, "Fourteen");
		unitmap.put(15, "Fifteen");
		unitmap.put(16, "Sixteen");
		unitmap.put(17, "Seventen");
		unitmap.put(18, "Eighteen");
		unitmap.put(19, "Nineteen");
		unitmap.put(20, "Twenty");
		unitmap.put(30, "Thirty");
		unitmap.put(40, "Fourty");
		unitmap.put(50, "Fifty");
		unitmap.put(60, "Sixty");
		unitmap.put(70, "Seventy");
		unitmap.put(80, "Eighty");
		unitmap.put(90, "Ninety");

		digitPlace.put(5, "Thousand");
		digitPlace.put(7, "Lakh");
		digitPlace.put(9, "Crore");
	}

	public NumberConversion() {
		initMap();
	}

	public String convert1(int number) {
		if (number == 0) {
			return "Zero";
		}
		String conversion = "";
		String unit = doubleDigitExtraction(number);
		if (unit != null) {
			conversion = conversion + unit;
		}

		number = number / 100;
		if (number > 0) {
			String hundred = singleDigitExtraction(number);
			if (hundred != null) {
				conversion = hundred + " Hundred " + conversion;
			}
		}
		number = number / 10;
		if (number > 0) {
			String thousand = doubleDigitExtraction(number);
			if (thousand != null) {
				conversion = doubleDigitExtraction(number) + " Thousand " + conversion;
			}
		}
		int digit = 7;
		while (number > 0) {
			number = number / 100;
			String digitStr = doubleDigitExtraction(number);
			if (digitStr != null) {
				conversion = doubleDigitExtraction(number) + " " + digitPlace.get(digit) + " " + conversion;
			}
			digit += 2;
		}
		return conversion.trim();
	}

	public String convert(int number) {
		if (number == 0) {
			return "Zero";
		}
		String conversion = "";
		String unit = doubleDigitExtraction(number);
		if (unit != null) {
			conversion = conversion + unit;
		}
		number = number / 100;
		if (number > 0) {
			String hundred = singleDigitExtraction(number);
			if (hundred != null) {
				conversion = hundred + " Hundred " + conversion;
			}
		}
		number = number / 10;
		if (number > 0) {
			String thousand = doubleDigitExtraction(number);
			if (thousand != null) {
				conversion = doubleDigitExtraction(number) + " Thousand " + conversion;
			}
		}
		number = number / 100;
		if (number > 0) {
			String thousand = doubleDigitExtraction(number);
			if (thousand != null) {
				conversion = doubleDigitExtraction(number) + " Lakh " + conversion;
			}
		}
		number = number / 100;
		if (number > 0) {
			String thousand = doubleDigitExtraction(number);
			if (thousand != null) {
				conversion = doubleDigitExtraction(number) + " Crore " + conversion;
			}
		}
		return conversion.trim();
	}

	private String doubleDigitExtraction(int number) {
		if (unitmap.get(number) != null) {
			return unitmap.get(number);
		}
		int reminder = number % 100;
		if (reminder < 20) {
			return unitmap.get(reminder);
		} else {
			int unit = reminder % 10;
			int ten = (reminder / 10) * 10;
			return unitmap.get(ten) + " " + unitmap.get(unit);
		}
	}

	private String singleDigitExtraction(int number) {
		return unitmap.get(number % 10);
	}

	public String checkTens(int i) {
		Map<Integer, String> tenstmap = new HashMap<>();
		tenstmap.put(0, "Zero");
		tenstmap.put(1, "One");
		tenstmap.put(2, "Twenty");
		tenstmap.put(3, "Thirty");
		tenstmap.put(4, "Fourty");
		tenstmap.put(5, "Fifty");
		tenstmap.put(6, "Sixty");
		tenstmap.put(7, "Seventy");
		tenstmap.put(8, "Eighty");
		tenstmap.put(9, "Ninety");

		return tenstmap.get(i);

	}

	public int checkPostion(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}

		return count;

	}
}
