package com.innova.iocli.cdisiz;

public class DataManager {
	private Database javaInterface;
	
	// paramatreli constructor
	public DataManager(Database javaInterface) {
		this.javaInterface = javaInterface;
	}
	
	// Metot
	public void newdataBasename() {
		javaInterface.databaseName();
	}
}
