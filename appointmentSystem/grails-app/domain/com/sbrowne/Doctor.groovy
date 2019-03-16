package com.sbrowne

class Doctor {

	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

	Surgery surgery
	static belongsTo=[Surgery]

	static hasMany=[patients:Patient, nurses:Nurse, appointments:Appointment, prescriptions:Prescription]


	String toString(){

	return fullName	
		
	}

	static constraints = {

	fullName nullable:false, blank:false, maxSize:50;
	qualification nullable:false, blank:false, maxSize:50;
	position nullable:false, blank:false, maxSize:15;
	doctorEmail nullable:false, blank:false, email:true, unique:true;
	password nullable:false, blank:false, password:true;
	doctorOffice nullable:false, blank:false, maxSize:15;
	doctorPhone nullable:false, blank:false, maxSize:15;
	bio nullable:false, blank:false, maxSize:5000, widget:'textarea';

	}
}
