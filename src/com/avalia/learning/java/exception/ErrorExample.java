package com.avalia.learning.java.exception;

public class ErrorExample {
	public long factorial(int i){
		long temp=1;
		while(i>1){
			temp= temp*i;
			i--;
		}
		return temp;
	}

	public long factorial1(int i){
		if (i==0)
			return 1;
		else
			return i*factorial1(i-1);
		
	}
}
