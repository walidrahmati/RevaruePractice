package com.max.appFunctions;

import java.util.Scanner;

import com.max.interfaces.CalculatorInterface;

public class Calculator implements CalculatorInterface{
	Scanner sc=new Scanner(System.in);
	boolean valid=false;
	public void simple() {
		//login l=new login();
		int c, num1, num2;
		

		while (!valid) {
			System.out.println("Please select the operation: ");
			System.out.println("1: Add.");
			System.out.println("2: Difference.");
			System.out.println("3: Exit.");
			System.out.print("Please enter your choice:> ");
			c=sc.nextInt();
			switch(c) {
			case 1:
				System.out.print("Please enter first number:> ");
				num1=sc.nextInt();
				System.out.print("Please enter second number:> ");
				num2=sc.nextInt();
				System.out.println("The result is "+sum(num1,num2));
				break;
			case 2:
				System.out.print("Please enter first number:> ");
				num1=sc.nextInt();
				System.out.print("Please enter second number:> ");
				num2=sc.nextInt();
				System.out.println("The result is "+diff(num1,num2));
				break;
			case 3:
				System.exit(0);
			default:
					System.out.println("Wrong input. Try again.");
			}
		}
	}
	public void advanced(){
		System.out.println("You are in Advanced mode");
	}
	@Override
	public int sum(int a, int b) {
		
		return a+b;
	}

	@Override
	public int diff(int a, int b) {
		
		return a-b;
	}
	
	

}
