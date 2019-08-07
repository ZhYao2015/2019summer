<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Student Here</title>
</head>
<body>
	<h1>Student List</h1>
	<table border="1" width="100%">
		<tr>
			<td>StudentNo</td>
			<td>LoginPwd</td>
			<td>StudentName</td>
			<td>Gender</td>
			<td>Birthday</td>
		</tr>
		
		<c:forEach var="s" items="${pageBean.data}">
			<tr>
				<td>${s.studentNo}</td>
				<td>${s.loginPwd}</td>
				<td>${s.studentName}</td>
				<td>${s.sex}</td>
				<td>${s.bornDate}</td>
			</tr>
			
		</c:forEach>
		
	</table>
	<div id="pageBar">
		<c:forEach var="p" begin="1" end="${pageBean.totalPage}" step="1">
			<a href="${pageContext.request.contextPath }/ListStudentServlet?pageNum=${p}&
			pageSize=${pageBean.pageSize}">${p}</a>&nbsp;
		</c:forEach>
	</div>
</body>
</html>