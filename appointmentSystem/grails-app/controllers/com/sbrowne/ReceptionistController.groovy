package com.sbrowne

class ReceptionistController {

    def scaffold = Receptionist

    def search(){

	
	} 

   	def results(String name){

   		def patients=Patient.where{

   			(patientName=~name) || (patientID=~name) || (patientResidence=~name)
   		
   		}.list()

   		return [patients:patients,

   			term:params.patient,

   			totalPatients: Patient.count()]

	}


    def login(){

	
	} 

	def validate(){
	
	def user = Receptionist.findByRecepUsername(params.recepUsername)


		if(user && user.recepPassword == params.recepPassword){

		session.user = user

		render view:'home'		

		}
		else{
	
		flash.message = "Invalid username and Password."

		render view:'login'

		}

	}

	def logout = {

	session.user = null

	redirect(uri:'/')	

	}
}
