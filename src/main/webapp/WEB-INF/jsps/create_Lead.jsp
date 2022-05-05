<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create | Lead</title>
</head>
<body>
<h3>Create | Lead</h3>
<form action="saveLead"method="post">
<pre>
FirstName:<input type="text" name="firstName">
LastName:<input type="text" name="lastName">
leadSource:
<select name="leadSource">
  <option value="TV">TV</option>
  <option value="Friends">Friends</option>
  <option value="Online">"Online"</option>
  <option value="Radio">Radio</option>
</select>
Email:<input type="text" name="email">
Mobile:<input type="text" name="mobile">
<input type="submit" value="Save">
</pre></form>
</body>
</html>