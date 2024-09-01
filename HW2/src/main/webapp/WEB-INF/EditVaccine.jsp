<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css"
        integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
        crossorigin="anonymous">
<title>EditVaccine</title>
</head>
<body>
	<form action="EditVaccine" method="post">

		<input type="hidden" name="id" value="${entry.id}">


		<table class="table table-striped" border="1">
			<tr>
				<td>Name</td>
				<td><input type="text" name="vacname" value="${entry.vacname}">
				</td>
			</tr>
			<tr>
				<td>Doses Required</td>
				<td><select name="shots">
						<option value="1">1</option>
						<option value="2">2</option></td>
			</tr>
			<td>Days between Doses</td>
			<td><input type="text" class="form-control" name="daysbetweendoses" value="${entry.daysBetweenDoses}">



			
			</td>

			<tr>
				<td>
					<button class="btn btn-primary">save</button>
					</form>
				</td>
			</tr>
</body>
</html>







