package com.innova.iocsiz.cdisiz;

public class Database {
	public void databaseName(String name) {
		if (name.equals("Mysql")) {
			System.out.println("MySQL");
		} else if (name.equals("MariaDb database")) {
			System.out.println("MariaDb database");
		} else if (name.equals("Mssql")) {
			System.out.println("MssSQL database");
		} else {
			System.out.println("Farklı bir database girdiniz");
		}
		
	}
}
