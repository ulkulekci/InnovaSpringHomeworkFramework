package com.innova.iocli.cdisiz;

public class PostgreSQL implements Database {
	
	@Override
	public void databaseName() {
		System.out.println("PostgreSQL");
	}
}
