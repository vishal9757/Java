package com.avalia.learning.java.exception;

public class Main {

	public static void main(String[] args){
		RunTimeExceptionExample r = new RunTimeExceptionExample();
		//r.Divide(5, 0);
//		r.length(null);
//		r.iterate(new String[]{"a","b"});
//		r.iterate(null);
//		CheckedExceptionExample cx = new CheckedExceptionExample();
//		cx.printFile("C:\\File.txt");
		
		ErrorExample e = new ErrorExample();
		System.out.println(e.factorial1(5));
		CustomExceptionExample custom = new CustomExceptionExample();
		try {
			custom.Execute();
		} catch (MyCustomException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
}
}
