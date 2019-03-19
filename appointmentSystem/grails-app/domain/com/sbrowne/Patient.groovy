package com.sbrowne

class Patient {

	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	String patientID
	Date dateRegistered
	String patientPhone
	
	Appointment appointment

	static belongsTo=[Doctor]

	static hasMany=[surgeries:Surgery, doctors:Doctor, prescriptions:Prescription]

	String toString(){

	return patientName	
		
	}


	
	static constraints = {

	patientName nullable:false, blank:false, maxSize:50;
	patientAddress nullable:false, blank:false, maxSize:255;
	patientResidence nullable:false, blank:false, maxSize:50;
	patientDob nullable:false, blank:false;
	patientID nullable:false, blank:false, maxSize:15;
	dateRegistered nullable:false, blank:false;
	patientPhone nullable:false, blank:false, maxSize:15;
	appointment nullable:true, blank:true;

	}
}
