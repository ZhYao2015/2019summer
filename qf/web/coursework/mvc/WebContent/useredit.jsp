<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit user here</title>
</head>
<body>
	<h2>Edit</h2>
	<form action="${pageContext.request.contextPath}/UserEditServlet" method="post"
	onsubmit="return confirm('Wirklich?')">
		<table>
			<tr>
				<td>Id</td>
				<td>
					<input type="text" name="id" value="${user.id}" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>Username</td>
				<td>
					<input type="text" name="username" value="${user.username}" readonly="readonly">		
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>
					<input type="text" name="password" value="${user.password}" >		
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>
					<input type="text" name="email" value="${user.email}" >		
				</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>
					<input type="radio" name="gender" value="M" ${user.gender=="M"?"checked='checked'":""}>Male
					<input type="radio" name="gender" value="F" ${user.gender=="F"?"checked='checked'":""}>Female
				</td>
			</tr>
			<tr>
				<td>Status</td>
				<td>
					<select name="flag">
						<option value="1" ${user.flag==1?"selected='selected'":""} >Activated</option>
						<option value="2" ${user.flag==2?"selected='selected'":""} >Unactivated</option>
						<option value="0" ${user.flag==0?"selected='selected'":""} >Disabled</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Role</td>
				<td>
					<select name="role">
						<option value="1" ${user.role==1?"selected='selected'":""}>Normal</option>
						<option value="0" ${user.role==0?"selected='selected'":""}>Admin</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>ActivationCode</td>
				<td>
					<input type="text" name="code" value="${user.code}" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>