package controller;

import java.sql.*;


import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		
		Connection c=null;
		c=ConnectionManager.getConnection();
		if(c!=null)
		{
			System.out.println("Connection Established");
		}
		else
			System.out.println("Check connection");
	}
}
