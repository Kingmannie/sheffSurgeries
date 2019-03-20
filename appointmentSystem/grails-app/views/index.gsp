<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>STH | Home Page</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body class="container" style="background-color: aliceblue;"  role="main">

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

</body>
</html>
