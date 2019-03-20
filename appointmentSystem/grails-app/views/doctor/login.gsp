<!DOCTYPE html>
<html>

  <head>
  <meta name="layout" content="main" />
  <title>Doctor Login</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
  </head>

  <body role="main">
	


  <div>
      <asset:image src="doctor-banner.jpg" class="img-rounded col-lg-12 mt-3" alt="Doctor Image"/>
  </div> 
  
  <br/>
  <hr>
	<g:if test="${flash.message}">
	<div class="message">${flash.message}</div>
	</g:if>

	<g:form action="validate">

	<input type="hidden" name="cName" value="${cName}">
	<input type="hidden" name="aName" value="${aName}">

  <div class="row">
    <div class="col-lg-3">
    </div>

    <div class="panel panel-default col-lg-6 border border-dark p-5">
      <table>
        <tr class="prop">
          <td class="name">
            <label for="dremail">Doctor User Name:</label>
          </td>
          <td class="value">
            <input type="text" id="dremail" name="dremail" value="">
          </td></tr>
        <tr class="prop">
          <td class="name">
            <label for="drpassword">Doctor Password:</label>
          </td>
          <td class="value">
            <input type="password" id="drpassword" name="drpassword" value="">
          </td></tr>
        <tr><td></td>
          <td>
            <input type="submit" value="login"/>
          </td></tr>
      </table>
    </div>

    <div class="col-lg-3">
    </div>
  </div>

    </g:form>
  </body>
</html>