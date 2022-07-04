package com.revature;

import java.math.BigDecimal;

import com.models.Fib;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BigDecimal r;
			Fib f=new Fib();
			f.fib_num();
			r=BigDecimal.valueOf(f.result);
			System.out.println("The 81st Fibonacci number is :"+ r);
			System.out.println(f.count + " Out first 81st Fibonacci sequence numbers start with number 1");
			
			
	}

}
