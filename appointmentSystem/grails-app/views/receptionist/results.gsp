<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Reception | Search</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="container" role="main">

    <hr>

    <div>
        <asset:image src="reception-banner.jpg" class="img-rounded col-lg-12" alt="reception Image"/>
    </div> 

    <div>
        <hr>
        <h1 class="text-center">Receptionist's Patient Search Results:</h1>
        <hr>
        <g:rcloginToggle/>
        <br>
        <br>
        <br>
    </div>

    <div class="container row justify-content-center">

        <p>
            
            Searched ${totalPatients} records

            for items matching <em>${term}</em>

            Found <strong>${patients.size()}</strong> patients.

        </p>

        <ul>

        <g:each var="patient" in="${patients}">

        <li><g:link controller="patient" action="show" id="${patient.id}">${patient.patientName}</g:link></li>
        
        </g:each>

        </ul>

        <div>
            <br>
            <br>
            <br>
        <button type="button" class="btn btn-success">
            <g:link action='search'>Search Again</g:link>
        </button>
    </div>


</div>

</body>
</html>