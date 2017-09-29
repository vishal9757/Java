package com.avalia.learning.java.stackqueue;

import java.util.Stack;

public class StackQueue {
	Stack<Integer> in = new Stack<>();
	Stack<Integer> out = new Stack<>();
	
	public void queue(int x){
		in.push(x);
	}
	
	public int dequeue(){
		if(out.isEmpty()){
			while(!in.isEmpty()){
				out.push(in.pop());
			}
		}
		
		return out.pop();
		
	}

}
