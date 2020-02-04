<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pizza Details</title>
</head>
<body>
	<div align="center">
		<h1>Pizza List</h1>
		<h3><a href="new">Add New Pizza and There Details</a></h3>
		<table border="1" cellpadding="5">
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Receipe</th>
				<th>Size</th>
				<th>Cost</th>
				<th>Type</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listPizza}" var="pizza" varStatus="status">
			<tr>
				<td>${status.index +1}</td>
				<td>${pizza.name}</td>
				<td>${pizza.receipe}</td>
				<td>${pizza.size}</td>
				<td>${pizza.cost}</td>
				<td>${pizza.type}</td>
				<td>
					<a href="edit?id=${pizza.id}">Edit</a>
					&nbsp;&nbsp;
					<a href="delete?id=${pizza.id}">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>