package com.avalia.learning.java.palindrome;

public class Armstrong {
	
	public boolean check(int i){
		int sum=0;
		int a=0;
		int c= i;
		while(c>0){
			a=c%10;
			c=c/10;
			sum = sum+a*a*a;
		}
		
		
			return sum==i;
		
	}
	
}
