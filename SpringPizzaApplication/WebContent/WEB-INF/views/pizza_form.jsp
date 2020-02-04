<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New/Update Pizza</title>
</head>
<body>
	<div align="center">
		<h1>New/Update Pizza</h1>
		<form:form action="save" method="post" modelAttribute="Pizza">
		<table cellpadding="5">
			<form:hidden path="id"/>
			<tr>
				<td>Pizza Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Receipe:</td>
				<td><form:input path="receipe"/></td>
			</tr>
			<tr>
				<td>Size:</td>
				<td><form:input path="size"/></td>
			</tr>
			<tr>
				<td>Cost:</td>
				<td><form:input path="cost"/></td>
			</tr>
			<tr>
				<td>Type:</td>
				<td><form:input path="type"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="save"/></td>
			</tr>
			</table>
		</form:form>
	</div>
</body>
</html>