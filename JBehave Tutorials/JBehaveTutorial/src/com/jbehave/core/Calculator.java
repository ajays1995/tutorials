package com.jbehave.core;

public class Calculator {
	
	private long result;
	
	public Calculator() {
		this.result =0;
	}
	
	public void performOperation(String op, int a, int b) {
		
		switch(op)
		{
		case "add":
			this.result = a+b;
			break;
		case "sub":
			if(a>b)
				this.result = a-b;
			break;
		case "mul":
			this.result = a*b;
			break;
		case "div":
			if(a!=0)
				this.result = a/b;
			break;
			default:
				System.out.println("operation is not listed");
				break;
		}
	}
	
	public long getResult(){
		return this.result;
	}
	

}
