package com.sbrowne

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	Surgery surgery
	static belongsTo=[Surgery]

	String toString(){

	return recepName	
		
	}	



	static constraints = {

	recepName nullable:false, blank:false, maxSize:50;
	recepEmail nullable:false, blank:false, email:true, unique:true;
	recepUsername nullable:false, blank:false, unique:true;
	recepPassword nullable:false, blank:false, password:true;
	recepPhone nullable:false, blank:false, maxSize:15;

	}
}
