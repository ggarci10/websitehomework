<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert 555 here</title>
   <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css"
        integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
        crossorigin="anonymous">
</head>
<body>


<table  class="table table-striped" border='1'>
<tr>
		<td>   Vaccine  </td>
<td><form action="NewPatient" method="post">  <select name="vaccine">


<c:forEach items="${entries}" var="entry">
		<option value="${entry.vacname}">${entry.vacname}</option>	
			</c:forEach>
	</select>
	
		  </td>
		  </tr>
		  <tr>
		  <td>
		 patient name</td>
		  <td>
		 <input type="text" class="form-control" name="patientname">
		  </td>
		 
		  </tr>
 <tr>
 <td>
 <button class="btn btn-primary">Add</button></form>
 </td>
		  </tr>
		  </table>	
		  </table>	
			
			
			
			
			
</body>
</html>