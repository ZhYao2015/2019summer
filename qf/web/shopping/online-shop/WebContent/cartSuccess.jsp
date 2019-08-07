<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width initial-scale=1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/login2.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>
	<%@ include file="header.jsp" %>
	<div class="container">
		<hr>
		<div class="row" style="width:30%;margin:0 auto;padding-top:20px">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">Cart Note</h3>
				</div>
				<div class="panel-body">
					<h3 class="text-default"><span class="glyphicon glyphicon-ok-sign"></span>
					&nbsp;&nbsp;&nbsp;&nbsp;Adding cart success</h3>
					<a href="${pageContext.request.contextPath}/getCart" class="btn btn-primary">Look into cart</a>
					<a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-default">Keep shopping</a>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
<body>

</body>
</html>