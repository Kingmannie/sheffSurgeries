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

	
	//declare static array with emergency situations
	def emergencylist = ["Broken Bone","Heart Attack","Unconscious"]

	//store size of emergency array
	def emergencylistsize =  emergencylist.size()

	//random variable
	def r = new Random()

	//get one item from emergency array & store in session data for use in tag
	1.times {

		session.data = emergencylist.get(r.nextInt(emergencylistsize))

	}


	}

	def logout = {

	session.user = null

	redirect(uri:'/')	

	}
}
