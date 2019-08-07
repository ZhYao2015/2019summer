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
	<div style="margin: 0 auto;width: 90%;">
		<ol class="breadcrumb">
			<li><a href="#">mi_shop</a></li>
			<li><a href="#">handy</a></li>
			<li class="active"><a href="getGoodsListByTypeId?typeId=${goods.typeId}">${goods.typeName}</a></li>
		</ol>
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-xs-6 col-md-6">
				<a href="#" class="thumbnail">
					<img src="" width="560"/>
				</a>
			</div>
			<div class="col-xs-6 col-md-6">
				<div class="panel panel-default" style="height:560px">
					<div class="panel-heading">Item Details</div>
					<div class="panel-body">
						<h3>item name:<small>${goods.name}</small></h3>
						<div style="margin-left:10px;">
							<p>Price:&nbsp;&nbsp;&nbsp;<span class="text-danger" style="font-size:15px;">${goods.price}</span>&nsbp;&nsbp;&nsbp;</p>
							<p>OnShelves:&nsbp;&nsbp;&nsbp;${goods.pubdate}</p>
							<p>SalesOnTrend:&nsbp;&nsbp;&nsbp;
								<c:forEach begin="1" end="${goods.star}">
									<img src="" alt="star"/>
								</c:forEach>
							</p>
							<p>Description:</p>
							<p>&nbsp;&nbsp;${goods.intro}</p>
							<a href="${pageContext.request.contextPath}/addCart?goodsId=${goods.id}&price=${goods.price}" class="btn btn-warning">
							</a>
							<button class="btn btn-danger">Jetzt Kaufen</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<%@ include file="footer.jsp" %>
</body>
</html>