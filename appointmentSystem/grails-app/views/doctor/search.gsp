<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Doctors | Search</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body class="container" role="main">

    <hr>

    <div>
        <asset:image src="doctor-banner.jpg" class="img-rounded col-lg-12" alt="Homepage Image"/>
    </div> 

    <div>
        <hr>
        <h1 class="text-center">Doctor's Prescription Search</h1>
        <hr>
        <g:drloginToggle/>
        <br>
        <br>
        <br>
    </div>

    <div class="row container justify-content-center">

        <formset>

            <legend>Search for Prescriptions</legend>

            <g:form action="medresults">
            <br>
            <label for="medname">Enter Medicine:</label>
            <br>
            <g:textField name="medname"/>
            <br>
            <g:submitButton name="search" value="Search"/>
            <br>
            </g:form>

            <g:form action="dosresults">
            <br>
            <label for="dos">Enter Days of Supply:</label>
            <br>
            <g:field type="number" name="dos"/>
            <br>
            <g:submitButton name="search" value="Search"/>
            <br>
            </g:form>

            <g:form action="totresults">
            <br>
            <label for="totcost">Enter Total Cost:</label>
            <br>
            <g:field type="number" name="totcost"/>
            <br>
            <g:submitButton name="search" value="Search"/>
            <br>
            </g:form>

        </formset>

    </div>
</div>

</body>
</html>