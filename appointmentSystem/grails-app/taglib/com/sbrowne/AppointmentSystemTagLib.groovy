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

	def drpager = {

		out << "<div class='p-3 mb-2 bg-danger text-white'>"

		out << "Welcome ${session.user}."

		out << "<div class='container text-center'>"

		out << "<p>${session.user} an emergency has been called in at ${formatDate()}.</p>"

		out << "<h3>Emergency Type: ${session.data}</h3><br>"

		out << "<strong>Please respond by filling the form out below"

		out << " and confirming.</strong>"

		out << "<form><br>"

		out << "<div>"

		out << "<label for='drresponse'>Enter Response Time:</label><br>"
            
        out << "<input type='time' name='drresponse'/><br><br>"

		out << "<button type='button' onclick='thanks()' class='btn btn-success'>Respond!</button>"

		out << "<div>"

		out << "</form>"

		out << "</div>"

		out << "</div>"

	}
}
