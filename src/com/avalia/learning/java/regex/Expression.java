package com.avalia.learning.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {
	public void expression(){
		Pattern p = Pattern.compile("aa");
		Matcher m = p.matcher("aaaabbbacaa");
		while(m.find()){
			System.out.println(m.start());
		}
		
	}
}
