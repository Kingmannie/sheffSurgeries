package com.sbrowne

class DoctorController {

    def scaffold = Doctor

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

	def results(String name){

		def doctors=Doctor.where{

			fullName=~name
		}.list()

	return [doctors:doctors,

			term:params.name,

			totalDoctors: Doctor.count()]


	}

	def logout = {

	session.user = null

	redirect(uri:'/')	

	}
}
