package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {
		String jdbcurl = "jdbc:postgresql://localhost:5432/estudos";
		String user = "postgres";
		String password = "Admin123";
		try {
			System.out.println("Conectando");

			Connection con = DriverManager.getConnection(jdbcurl, user, password);

			System.out.println("vitória");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
