package com.sbrowne

class DoctorController {

    def scaffold = Doctor

    def search(){
	
	} 

   	def medresults(String medname){

   		def prescriptions=Prescription.where{

   			medicine=~medname
   		
   		}.list()

   		return [prescriptions:prescriptions,

   			term:params.prescription,

   			totalPrescriptions: Prescription.count()]

	}

	def dosresults(){

   		def prescriptions=Prescription.findAllByDaysOfSupply(params.dos).asList()

   		return [prescriptions:prescriptions,

   			totalPrescriptions: Prescription.count()]

	}

	def totresults(){

		def prescriptions=Prescription.findAllByTotalCost(params.totcost).asList()

   		return [prescriptions:prescriptions,

   			totalPrescriptions: Prescription.count()]

	}


    def login(){

	
	} 

	def validate(){
	
	def user = Doctor.findByDoctorEmail(params.dremail)


		if(user && user.password == params.drpassword){

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
