package com.innova.cdi.scoped;

import java.io.Serializable;

import javax.inject.Named;

// pojo<Bean<managementBean<CdiBEan
@Named(value = "sessionCDI")
@SessionScoped // tek oturum boyunca yaşar: farklı browser çalışmaz aynı browserda yaşar

public class SessionScoped implements Serializable {
	private static final long serialVersionUID = -1806256027076814974L;
	
	public String scoped() {
		return "Session Scope: " + hashCode();
	}
	
}