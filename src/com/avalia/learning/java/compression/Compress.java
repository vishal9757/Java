package com.avalia.learning.java.compression;

public class Compress {
	public void compress(String str) {
		char[] c = str.toCharArray();
		char temp = c[0];
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == temp)
				count++;
			else {
				sb.append(temp);
				sb.append(count);
				temp = c[i];
				count = 1;
			}
		}
		sb.append(temp);
		sb.append(count);
		System.out.println(sb);
	}

	// for (int j = i + 1; j < c.length; j++) {
	// if (c[i] == c[j]) {
	// count++;
	// c[j] = '0';
	// } else if (c[i] != c[j]) {
	// sb.append(str.charAt(i));
	// sb.append(count);
	// break;
	// }
	// }
	// x= count;
	// }
	// sb.append(str.charAt(str.length()-1));
	// sb.append(x);
	// String q = sb.toString();
	// System.out.print(q);

	// if (q.length() < str.length()) {
	// System.out.println(q);
	// } else if (q.length() >= str.length()) {
	// System.out.println(str);
	// }

}
