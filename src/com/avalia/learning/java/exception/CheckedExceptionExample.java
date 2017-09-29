package com.avalia.learning.java.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionExample {
	public void printFile(String path) {
		try {
			Scanner in = new Scanner(new BufferedReader(new FileReader(path)));
			while (in.hasNextLine()) {
				String line = in.nextLine().trim();
				if (!line.isEmpty()) // Ignore blank lines
					System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
