package com.revature;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String[] weekDays= {"Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday","Sunday"};
		
		for (String week : weekDays) {
			if (week.charAt(0)=='T' || week.charAt(0)=='S') {
				System.out.println(week +" Go to Gym");
			}
			else 
				System.out.println(week +" Stay home.");
		}
	}

}
