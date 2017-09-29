package com.avalia.learning.java.exception;

public class RunTimeExceptionExample {

	public int Divide(int x, int y){
		if(y==0){
			throw new ArithmeticException("Divide by 0");
		}
		
		return x/y;
	
	}
	
	public int length(String s){
		if(s==null)
			return 0;
		return s.length();
	}
	
	public void iterate(String[] str){
		if(str==null)
			return ;
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
