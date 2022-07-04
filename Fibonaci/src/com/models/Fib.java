package com.models;

public class Fib {
	
	public double result, num1=0, num2=1;
	String s;
	public int count=1;
	
	public void fib_num() {
		
		for (int i=0; i<80;i++) {
			
			result=num1+num2;
			num1=num2;
			num2=result;
			s=String.valueOf(result);
			if (s.charAt(0)=='1')
				count++;
		}
		
			this.count=count;
			this.result=result;
	
	}

}
