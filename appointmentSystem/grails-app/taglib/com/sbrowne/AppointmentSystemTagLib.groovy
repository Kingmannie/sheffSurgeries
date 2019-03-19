package com.sbrowne

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

        def drloginToggle = {

		if (request.getSession(false) && session.user){
		
		out << "<span style='float:left; margin-left:15px'>"

		out << "Welcome ${session.user}."

		out << "</span><span style ='float:right; margin-right:15px'>"

		out << "<a href='${createLink(controller:'doctor', action:'logout')}'>"

		out << "Logout </a></span>"

		}else{

		out << "<a href='${createLink(controller:'doctor', action:'login')}'>"

		out << "Login</a>"

		}

	}

	    def rcloginToggle = {

		if (request.getSession(false) && session.user){
		
		out << "<span style='float:left; margin-left:15px'>"

		out << "Welcome ${session.user}."

		out << "</span><span style ='float:right; margin-right:15px'>"

		out << "<a href='${createLink(controller:'receptionist', action:'logout')}'>"

		out << "Logout </a></span>"

		}else{

		out << "<a href='${createLink(controller:'receptionist', action:'login')}'>"

		out << "Login </a>"

		}
	}
}
