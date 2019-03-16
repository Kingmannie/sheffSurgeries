package com.sbrowne

class Nurse {

	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

	Surgery surgery
	static belongsTo=[Surgery]

	static hasMany=[doctors:Doctor]

	String toString(){

	return nurseName	
		
	}


	static constraints = {

	nurseName nullable:false, blank:false, maxSize:50;
	qualifications nullable:false, blank:false, maxSize:50;
	nurseEmail nullable:false, blank:false, email:true, unique:true;
	nurseOffice nullable:false, blank:false, maxSize:50;
	nursePhone nullable:false, blank:false, maxSize:15;

	}
}
