<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css"
        integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
        crossorigin="anonymous">
<title>VaccineEntry</title>
</head>
<body>

   <p><a href="NewVaccine">New Vaccine</a>
	      <a href="NewDoses">| New Doses</a></p>
	<table class="table table-striped" border="1">
		<tr>
			<td scope="col">Vaccine</td>
			<td scope="col">Doses Require</td>
			<td scope="col">Days Between Doses</td>
			<td scope="col">Total Doses Received</td>
			<td scope="col">Total Doses Left</td>
		</tr>
	
		<c:forEach items="${entries}" var="entry">
			<tr>
				<td>${entry.vacname}</td>
				<td>${entry.dosesRequired}</td>
			<td>${entry.daysBetweenDoses}</td>
<td>${entry.totalDosesReceived}</td>
<td>${entry.totalDosesLeft}</td>

<td>
<a href="EditVaccine?id=${entry.id}">edit</a>
 </td>
			</tr>


		</c:forEach>




	</table>
</body>
</html>