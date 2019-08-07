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
	<div class="panel panel-default" style="margin: 0 auto;width:95%">
		<div class="panel-heading">
			<h3 class="panel-title"><span class="glyphicon glyphicon-th-list"></span>
				&nbsp;&nbsp;ItemList
			</h3>
		</div>
		<div class="panel-body">
			<div class="row" style="margin: 0 auto;">
				<c:forEach items="${glist}" var="g" varStatus="i">
					<div class="col-sm-3">
						<div class="thumnail">
							<img src="" width="180" height="180" alt="mi6" />
							<div class="caption">
								<h4>ItemList<a href=""></a></h4>
								<p>Sales on trend
									<c:forEach begin="1" end="${g.star}">
										<img src="" alt="star"/>
									</c:forEach>
								</p>
								<p>On Shelves:${g.pubdate}</p>
								<p style="color:orange">Price:${g.price}</p>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
			<div >
				<!-- paging -->
			</div>
			
		</div>
		<%@ include file="footer.jsp" %>
</body>
</html>