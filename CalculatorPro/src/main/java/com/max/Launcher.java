package com.max;

import java.sql.Connection;
import java.sql.SQLException;

import com.max.appFunctions.login;
import com.max.util.ConnectionUtil;


public class Launcher {
	public boolean logged=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		System.out.println("_____Welcome to Calculator Pro_______");
		new login();
//		try(Connection conn = ConnectionUtil.getConnection()){
//			System.out.println("Application Started.");
////			UserDAO user=new UserDAO();
//			//user.getUsers();
//		} catch (SQLException e) {
//			//if the connection fails to open, catch the resulting SQLException and print the stack trace (error log)
//			System.out.println("Application started but connection to DB failed...");
//			System.out.println("Your functionalities will be limited.");
//			
//		}
	}

}
