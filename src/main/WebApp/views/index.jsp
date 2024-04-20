<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter the details</h1>
	<form:form action="/success" modelAttribute="request" method="POST">
		<table>
			<tr>
				<td>Enter FirstName</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter LastName</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter From</td>
				<td><form:input path="from1" /></td>
			</tr>
			<tr>
				<td>Enter To</td>
				<td><form:input path="to1" /></td>
			</tr>
			<tr>
			<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>