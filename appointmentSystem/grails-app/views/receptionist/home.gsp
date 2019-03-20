<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Reception | Home Page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="container" role="main">


	<hr>

	<div>
	    <asset:image src="reception-banner.jpg" class="img-rounded col-lg-12" alt="Homepage Image"/>
	</div> 

    <div>
        <hr>
        <h1 class="text-center">Receptionist's Homepage</h1>
        <hr>
        <g:rcloginToggle/>

        <br>
    </div>




    <div class="container">
		<hr>
	    <div class="row">
	    	<h4 class="text-center">Register Patients, Doctors, Employees, Nurses, Receptionists</h4>
	    	<hr>
		</div>

		<div class="row">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">Register</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">1</th>
			      <td><button type="button" class="btn btn-link">
	    			<g:link controller="patient" action="create">Create Patient</g:link>
	    			</button></td>
			    </tr>
			    <tr>
			      <th scope="row">2</th>
			      <td><button type="button" class="btn btn-link">
	    			<g:link controller="doctor" action="create">Create Doctor</g:link>
	    			</button></td>
			    </tr>
			    <tr>
			      <th scope="row">3</th>
			      <td><button type="button" class="btn btn-link">
	    			<g:link controller="nurse" action="create">Create Nurse</g:link>
	    			</button></td>
			    </tr>
					<th scope="row">4</th>
			      <td><button type="button" class="btn btn-link">
	    			<g:link controller="receptionist" action="create">Create Receptionist</g:link>
	    			</button></td>
			    </tr>
			  </tbody>
			</table>
	    </div>

 		<div class="row">
	 		<hr>
	    	<h4 class="text-center">Assign Nurses & Patients to Doctor</h4>
	    	<hr>
    	</div>

	 	<div class="row">
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">Assign</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">1</th>
			      <td><button type="button" class="btn btn-link">
	    			<g:link controller="nurse" action="index">Assign Nurse to Doctor</g:link>
	    			</button></td>
	    		</tr>
	    		<tr>
	    			<th scope="row">2</th>
			      	<td><button type="button" class="btn btn-link">
	    			<g:link controller="patient" action="index">Assign Patient to Doctor</g:link>
	    			</button></td>
			    </tr>
			  </tbody>
			</table>
	    </div>
    </div>


</body>
</html>