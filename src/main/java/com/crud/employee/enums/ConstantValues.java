package com.crud.employee.enums;

public enum ConstantValues {

	CURRENT("current"),
	RESIGN("resign");

	private final String value;
	
	ConstantValues(String value) {
	    this.value = value;
	}

	
 
	  public String  getValue() {
	        return value;
	    }
	
}
