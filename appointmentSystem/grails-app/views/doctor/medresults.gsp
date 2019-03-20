<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Doctors | Results</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body class="container" role="main">

    <hr>

    <div>
        <asset:image src="doctor-banner.jpg" class="img-rounded col-lg-12" alt="Homepage Image"/>
    </div>

    <div>
        <hr>
        <h1 class="text-center">Doctor's Prescription Search:</h1>
        <hr>
        <g:drloginToggle/>
        <br>
        <br>
        <br>
    </div>

    <div class="container row justify-content-center">

        <p>
            
            Searched ${totalPrescriptions} records

            for items matching <em>${term}</em>

            Found <strong>${prescriptions.size()}</strong> prescriptions.

        </p>

        <ul>

        <g:each var="prescription" in="${prescriptions}">

        <li><g:link controller="prescription" action="show" id="${prescription.id}">${prescription.medicine}</g:link></li>
        
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