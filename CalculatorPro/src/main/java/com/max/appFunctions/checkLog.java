package com.max.appFunctions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.max.util.ConnectionUtil;

public class checkLog {
	Calculator cal=new Calculator();
	Scanner sc=new Scanner(System.in);
	boolean CheckLogin(String user, String password) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String query = "SELECT * FROM users where user_name=? and user_password=?";
			PreparedStatement st= conn.prepareStatement(query);
			st.setString(1, user);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				cal.advanced();
				login.valid=true;
			}else {
				System.out.println("User does not exist. Try again.");
				new login();
			}
		} catch (SQLException e) {

			System.out.println("We are sorry, but we are unable to log you in due to server issues.");
			System.out.println("Please use the calculator with limited functionalities.");
			System.out.println("We will look into it soon.");
			System.out.println("Please press any key to continue...");
			sc.next();
			cal.simple();
		}
		return false;
	}
}
