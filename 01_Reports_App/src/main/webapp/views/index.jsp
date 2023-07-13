<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Reports App</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>

	<div class="container">
		<h1 class="pt-3 pb-3">Report Application</h1>

		<form:form action="/searchData" modelAttribute="search" method="POST">

			<table>
				<tr>
					<td>Plan Names:</td>
					<td><form:select path="planName">
							<form:option value=""> -Select- </form:option>
							<form:options items="${names}" />
						</form:select></td>

					<td>Plan Status:</td>
					<td><form:select path="planStatus">
							<form:option value=""> -Select- </form:option>
							<form:options items="${status}" />
						</form:select></td>

					<td>Gender:</td>
					<td><form:select path="gender">
							<form:option value=""> -Select- </form:option>
							<form:option value="Male">Male</form:option>
							<form:option value="Fe-Male">Fe-Male</form:option>
						</form:select></td>
				<tr>
				<tr>
					<td>Start Date:</td>
					<td><form:input path="startDate" type="date"
							date-date-format="mm/dd/yyyy" /></td>
					<td>End Date:</td>
					<td><form:input path="endDate" type="date"
							date-date-format="mm/dd/yyyy" /></td>
				</tr>

				<tr>
					<td><a href="/" class="btn btn-secondary">Reset</a></td>
					<td><input type="Submit" value="Search"
						class="btn btn-primary"></td>
				</tr>
			</table>
		</form:form>

		<hr>
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>S.No</th>
					<th>Holder Name</th>
					<th>Gender</th>
					<th>Plan Name</th>
					<th>Plan Status</th>
					<th>Start date</th>
					<th>End Date</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${plans}" var="plan" varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${plan.citizenName}</td>
						<td>${plan.gender}</td>
						<td>${plan.planName}</td>
						<td>${plan.planStatus}</td>
						<td>${plan.planStartDate}</td>
						<td>${plan.planEndDate}</td>
					</tr>
				</c:forEach>
				<tr>
					<c:if test="${empty plans}">
						<td colspan="7" align="center">No Record Found</td>
					</c:if>
				</tr>
			</tbody>
		</table>

		<hr>
		Export : <a href="/excel">Excel</a> <a href="/pdf">Pdf</a>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>