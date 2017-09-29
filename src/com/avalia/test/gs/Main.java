package com.avalia.test.gs;
/* Save this in a file called Main.java to compile and test it */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
	public static int processData(ArrayList<String> array) {
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (String string : array) {
			String[] emp = string.split(",");
			int dept = Integer.parseInt(emp[2].trim());
			int sal = Integer.parseInt(emp[3].trim());
		//	Integer lowestSalary = map.get(dept);
//			if (lowestSalary == null) {
//				map.put(dept, sal);
//			else if (sal < lowestSalary) {
				map.put(dept, sal);
			}

	//	}
		return map.lastEntry().getValue();
	}

	public static void main(String[] args) {
		ArrayList<String> inputData = new ArrayList<String>();
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
			while (in.hasNextLine()) {
				String line = in.nextLine().trim();
				if (!line.isEmpty()) // Ignore blank lines
					inputData.add(line);
			}
			int retVal = processData(inputData);
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
			output.println("" + retVal);
			output.close();
		} catch (IOException e) {
			System.out.println("IO error in input.txt or output.txt");
		}
	}
}
