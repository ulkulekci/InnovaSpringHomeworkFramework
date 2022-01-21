package com.innova.iocli.cdisiz;

public class MySQL implements Database {
	
	@Override
	public void databaseName() {
		System.out.println("MySQL");
	}
}
