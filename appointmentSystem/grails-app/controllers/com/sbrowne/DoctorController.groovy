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

	def logout = {

	session.user = null

	redirect(uri:'/')	

	}
}
