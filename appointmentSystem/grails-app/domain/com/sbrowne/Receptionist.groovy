package com.sbrowne

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone
	
	static constraints = {

	recepName nullable:false, blank:false, maxSize:50;
	recepEmail nullable:false, blank:false, email:true, unique:true;
	recepUsername nullable:false, blank:false, unique:true;
	recepPassword nullable:false, blank:false, password:true;
	recepPhone nullable:false, blank:false, maxSize:15;

	}
}
