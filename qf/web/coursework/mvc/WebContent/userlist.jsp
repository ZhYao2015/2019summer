<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserList</title>
</head>
<body>
	<h1>User List</h1>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Username</td>
			<td>Password</td>
			<td>Email</td>
			<td>Gender</td>
			<td>Flag</td>
			<td>Role</td>
			<td>Code</td>
			<td>Operation</td>
		</tr>

		<c:forEach var="user" items="${userlist}">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.email}</td>
				<td>${user.gender}</td>
				<td>${user.flag==1?"Activated":user.flag==2?"Unactivated":"Disabled"}</td>
				<td>${user.role==0?"Admin":"Normal"}</td>
				<td>${user.code}</td>
				<td><a href="${pageContext.request.contextPath}/UserServlet?userid=${user.id}">Update</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/UserDeleteServlet?userid=${user.id}"
				onclick="return confirm('Wirklich?')">Remove</a></td> 
			</tr>
		</c:forEach>
	</table>
</body>
</html>