<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <g:layoutHead/>
</head>

<body class="container" style="background-color: aliceblue;">

    <div>
        <asset:image src="homepage-banner.jpg" class="img-rounded col-lg-12 mt-3" alt="Homepage Image"/>
    </div>

    <div>
        <hr>
        <h1 class="text-center">Welcome to Sheffield Teaching Hospitals</h1>
        <hr>
    </div>

    <div class="row">
        <div class="col-lg-1">
        </div>
        <div class="border border-dark mt-1 col-lg-4">
                <h2>Doctors Login</h2>
            <hr>
            <div class="panel-body">
                <h5>Doctors Login Here:</h5><g:drloginToggle/>
                <br/>
                <hr>
            </div>
        </div>

        <div class="col-lg-2">
        </div>

        <div class="border border-dark mt-1 col-lg-4">
                <h2>Receptionists Login</h2>
            <hr>
            <div class="panel-body">
                <h5>Receptionists Login Here:</h5><g:rcloginToggle/>
                <br/>
                <hr>
            </div>
        </div>
        <div class="col-lg-1">
        </div>

    </div>

<g:layoutBody/>

<footer class="page-footer font-small blue pt-4">

<hr>

    <!-- Footer Links -->
    <div class="footer-copyright text-center py-3">© 2019 Copyright Sheffield Teaching Hospitals
    </div>
    <!-- Copyright -->

  </footer>
  <!-- Footer -->


<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
