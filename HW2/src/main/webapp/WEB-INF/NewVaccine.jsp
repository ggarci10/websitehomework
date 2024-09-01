<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

   <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css"
        integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
        crossorigin="anonymous">
<title>NewVaccine</title>
</head>
<body>
	<form action="NewVaccine" method="post">
		<table  class="table table-striped" border="1">
			<tr>
				<td>name</td>
				<td><input type="text" name="name"><br></td>
			</tr>
			<td>Doses Required</td>
			<td>
				<form action="NewVaccine" method="post">

					<select name="shots">
						<option value="1">1</option>
						<option value="2">2</option>
					</select>
					</form>
			
			<tr>
				<td>Days Between Doses</td>
				<td><input type="text"  class="form-control"  name="daysbetweendoses"><br>
				</td>
			</tr>
			<td>
				<button class="btn btn-primary">Add</button>
				</form>
			</td>
			</tr>
</body>
</html>







