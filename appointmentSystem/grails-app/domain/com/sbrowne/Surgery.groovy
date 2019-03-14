package com.sbrowne

class Surgery {
	
	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	int numberOfDoctors
	String description
	String openingTime
	

	static constraints = {
	
	name nullable:false, blank:false, maxSize:50;
	address nullable:false, blank:false, maxSize:255;
	postcode nullable:false, blank:false, maxSize:15;
	telephone nullable:false, blank:false, maxSize:15;
	numberOfPatients nullable:false, blank:false, max:200;
	numberOfDoctors nullable:false, blank:false, max:20;
	description nullable:false, blank:false, maxSize:5000, widget:'textarea';
	openingTime nullable:false, blank:false, maxSize:15;

	}
}
