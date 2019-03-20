<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Reception | Search</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="container">

    <hr>

    <div>
        <asset:image src="reception-banner.jpg" class="img-rounded col-lg-12" alt="reception Image"/>
    </div> 

    <div>
        <hr>
        <h1 class="text-center">Receptionist's Patient Search</h1>
        <hr>
        <g:rcloginToggle/>
        <br>
        <br>
        <br>
    </div>

    <div class="row container justify-content-center">

        <formset>

            <legend>Search for Patients</legend>

            <g:form action="results">

            <label for="name">Enter Full Name/Patient ID/Residence:</label>
            <br>
            <g:textField name="name"/>
            <br>
            <br>

            <g:submitButton name="search" value="Search"/>

            </g:form>

        </formset>

    </div>

</body>
</html>