<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css"
	integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
	crossorigin="anonymous">
</head>
<body>

	<a href="NewPatient">New Patient</a>
	<table class="table table-striped" border="1">
		<tr>
			<td scope="col">ID</td>
			<td scope="col">name</td>
			<td scope="col">vacname</td>
			<td scope="col">1st dose</td>
			<td scope="col">2st dose</td>
		</tr>
		<c:forEach items="${entry}" var="what">
			<tr>
				<td>${what.id}</td>
				<td>${what.patientName}</td>
				<td>${what.vacName}</td>

				<td><fmt:formatDate value="${what.dateRecieved}"
						pattern="M-d-yyyy" /></td>

				<c:forEach items="${entries}" var="stuff">
					<c:if test="${stuff.vacname == what.vacName}">
						<c:if test="${what.doseTwo == false}">







							<c:if test="${stuff.totalDosesLeft > 0}">



								<c:if test="${stuff.dosesRequired == 2}">
									<td><a href="SecondDose?id=${what.id}">
											make an appointment</a></td>
								</c:if>




								<c:if test="${stuff.dosesRequired == 1}">
									<td>-</td>
								</c:if>
							</c:if>

							<c:if test="${stuff.totalDosesLeft ==0&&stuff.dosesRequired==2}">
								<td>out of stock</td>
							</c:if>
<c:if test="${stuff.totalDosesLeft ==0&&stuff.dosesRequired==1}">
								<td>-</td>
							</c:if>
						</c:if>
						<c:if test="${what.doseTwo == true}">
						<td><fmt:formatDate value="${what.secondDate}"
						pattern="M-d-yyyy" /></td>
					</c:if>
					</c:if>

					

				</c:forEach>


				<p>${stuff.vacname}</p>
		</c:forEach>
</body>
</html>