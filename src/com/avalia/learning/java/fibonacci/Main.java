package com.avalia.learning.java.fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		if(x==1){
			System.out.println("0");
		}else{
		f.print(f.fibonacci(x));
		}
		

	}

}
