package com.max.appFunctions;

import java.util.Scanner;

public class login {
	static boolean valid=false;
	public login() {
		checkLog chk=new checkLog();
		int c=0;
		Calculator cal=new Calculator();
		String user, pass;
		Scanner sc= new Scanner(System.in);

		while (!valid) {
		System.out.println("Please select an option:");
		System.out.println("1: Login");
		System.out.println("2: Continue without login (You will have limited functions.)");
		System.out.println("3: Exit.");
		System.out.print("Please enter your choice (1 or 2)> ");
		c=sc.nextInt();
		switch (c) {
		
		case 1:
			System.out.print("Please enter your user name:> ");
			user=sc.next();
			System.out.print("Please enter your password:> ");
			pass=sc.next();
			chk.CheckLogin(user,pass);
			break;
		case 2:
			cal.simple();
			valid=true;
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Wrong entry. Try again.");
				
		}
		}
		sc.close();
	}
}