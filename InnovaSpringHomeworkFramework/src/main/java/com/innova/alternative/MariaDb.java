package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative

public class MariaDb implements IDatabaseName {
	
	@Override
	public String databaseName(String data) {
		return "database MariaDb";
	}
	
}