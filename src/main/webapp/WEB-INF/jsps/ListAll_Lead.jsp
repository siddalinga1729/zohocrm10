<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ include file="menu_Lead.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<a href="viewLeadPage">Create New Lead</a>
	<h3>List Of Leads</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>firstName</th>
			<th>lastName</th>
			<th>leadSource</th>
			<th>email</th>
			<th>mobile</th>
		</tr>
		<c:forEach items="${leads }" var="lead">  
       <tr>
       <td>${lead.id }</td><!-- names should match with entity class -->
       <td><a href="getById?id=${lead.id }">${lead.firstName }</a></td>
       <td>${lead.lastName }</td>
       <td>${lead.leadSource }</td>
       <td>${lead.email }</td>
       <td>${lead.mobile }</td>
       </tr>
       </c:forEach> 
	</table>
</body>
</html>