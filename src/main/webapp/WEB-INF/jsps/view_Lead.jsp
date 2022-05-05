<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu_Lead.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head><br>
<body>
Id:${lead.id}<br>
FirstName:${lead.firstName}<br>
LastName:${lead.lastName}<br>
leadSource:${lead.leadSource}<br>
Email:${lead.email}<br>
mobile:${lead.mobile}
<form action="compose" method="post">
<input type="hidden" name="emailid"value="${lead.email}">
<input type="submit" value="Email">
</form>
</body>
</html>