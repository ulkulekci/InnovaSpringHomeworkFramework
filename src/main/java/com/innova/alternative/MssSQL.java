package com.innova.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MssSQL implements IDatabaseName {
	@Override
	public String databaseName(String data) {
		return "database MssSQL";
	}
	
}
