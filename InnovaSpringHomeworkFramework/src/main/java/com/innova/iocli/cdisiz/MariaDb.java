package com.innova.iocli.cdisiz;

public class MariaDb implements Database {
	
	@Override
	public void databaseName() {
		System.out.println("MariaDb");
	}
}
