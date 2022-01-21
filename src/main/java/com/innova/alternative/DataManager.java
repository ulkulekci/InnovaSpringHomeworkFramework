package com.innova.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class DataManager {
	
	@Inject
	private IDatabaseName iDatabaseName;
	
	public String getiJavaVersion() {
		return iDatabaseName.databaseName("adlar:");
	}
	
}