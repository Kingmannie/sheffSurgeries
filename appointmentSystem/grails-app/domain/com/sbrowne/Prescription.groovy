package com.sbrowne

class Prescription {

	String pharmacyName
	int prescripNumber
	String medicine
	double totalCost
	Date dateIssued
	Boolean patientPaying
	int daysOfSupply
	Doctor doctor

	static belongsTo=[Doctor]

	Patient patient

	String toString(){

	return medicine	
		
	}

	static constraints = {

	pharmacyName nullable:false, blank:false, maxSize:50;
	prescripNumber nullable:false, blank:false, max:100000;
	medicine nullable:false, blank:false, maxSize:50;
	totalCost nullable:false, blank:false, scale:2;
	dateIssued nullable:false, blank:false;
	patientPaying nullable:false, blank:false;
	daysOfSupply nullable:false, blank:false, max:1000;

	}
}
