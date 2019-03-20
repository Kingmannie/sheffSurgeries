<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Doctors | Home Page</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body class="container" role="main">

    <hr>
    
    <div>
        <asset:image src="doctor-banner.jpg" class="img-rounded col-lg-12" alt="Doctor Image"/>
    </div> 

    <div>
        <hr>
        <h1 class="text-center">Doctor's Homepage</h1>
        <hr>
        <g:drloginToggle/>
        <br>
    </div>

    <div class="container">
        <hr>
        <div class="row">
            <h4 class="text-center">Doctors Admin Below</h4>
            <hr>
        </div>

        <div class="row">
            <table class="table">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Create Prescriptions</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td><button type="button" class="btn btn-link">
                    <g:link controller="prescription" action="create">Create Prescription</g:link>
                    </button></td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td><button type="button" class="btn btn-link">
                    <g:link controller="prescription" action="index">Display Prescriptions</g:link>
                    </button></td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td><button type="button" class="btn btn-link">
                    <g:link controller="patient" action="index">Display Patients</g:link>
                    </button></td>
                </tr>
                <tr>
                  <th scope="row">4</th>
                  <td><button type="button" class="btn btn-link">
                    <g:link controller="appointment" action="index">Display Appointments</g:link>
                    </button></td>
                </tr>
              </tbody>
            </table>
        </div>
    <hr>
    <div class="row text-center">
        <a style="font-size:24px;" href="/doctor/search">Prescription Search Click Here</a>
    </div>
    <hr>

    </div>
</div>

</body>
</html>