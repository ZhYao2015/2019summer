<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" http-equiv="Content-Type" content="text/html">
<link rel="stylesheet" type="text/css" href="css/login2.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.min.js"></script>
<title>Insert title here</title>

	<script type="text/javascript">
		$(document).ready(function(){
			$.ajax({
				url:"${pageContext.request.contextPath}/goodsTypeList",
				method:"get",
				success:function(data){
					var list=JSON.parse(data);
					for(var t in list){
						var a=$("<a href='${pageContext.request.contextPath}/getGoodsListByTypeId?typeid="+list[t].id+"'>"+list[t].name+"</a>")
						$("#goodsType").append(a);
					}
				},
				error:function(){
					alert("failed");
				}
			})
		})
	</script>

</head>
<body>
	<div id="top">
		<div id="topdiv">
			<span>
				<a href="index.jsp" id="a_top" target="_blank">xmi shop</a>
				<li>|</li>
				<a href="" id="a_top">xmi mobile</a>
				<li>|</li>
				<a href="" id="a_top">feedback</a>
			</span>
			<span style="float:right">
				<c:if test="${empty user}">
					<a href="login.jsp" id="a_top">login</a>
					<li>|<li>
					<a href="register.jsp" id="a_top">register</a>
				</c:if> 
				<c:if test="${not empty user}">
					<a href="userAddress?flag=show" id="a_top">${user.username}</a>
					<li>|</li>
					<a href="userLogout" id="a_top">logout</a>
					<li>|</li>
					<a href="getOrderList" id="a_top">My Orders</a>
				</c:if>
				<li>|</li>
				<a href="" id="a_top">notification</a>
				<a href="${pageContext.request.contextPath}/getCart" id="shopcar">backet</a>
			</span>
		</div>
	</div>
</body>
</html>