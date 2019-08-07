<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
		/*  */
		$(function(){
			//1.username
			$("#username").change(function(){
				$.get("checkUserName","username="+this.value,function(data){
					if(data==0){
						$("#nameMsg").html("user does not exists").css("color","red");
					}else{
						$("#nameMsg").html("");
					}
				});
			})
			//2.captcha
			
			//3.captcha verification
			
			//4.Automatical login in two weeks
			$("#autoLogin").click(function(){
				if(this.checked){
					$("autoLoginMsg").html("do not tick that if using a public pc")
					.css("color","red");
				}else{
					$("autoLoginMsg").html("");
				}
			})
		})
	</script>
<title>Login</title>
</head>
<body>
	<!-- login -->
	<div>
		<div>
			<a href="${pageContext.request.contextPath}/index.jsp" target="_blank">
				<img src="" />
			</a>
		</div>
	</div>
	
	<form method="post" action="userLogin" class="form center" id="userLogin">
		<div class="login">
			<div class="login_center">
				<div class="login_top">
					<div class="left">
						Mitglieder einloggen
					</div>
					<div class="right">
						Noch nicht als Mitglieder?
						<a href="${pageContext.request.contextPath}/register.jsp" target="_self">
							Jetzt anmelden
						</a>
					</div>
					<div class="clear">
					</div>
					<div class="xian center">
					</div>
				</div>
				<div class="login_main center">
					<div class="username">
						<div class="left">Username:&nbsp;</div>
						<div class="right">
							<input type="text" name="username" id="username" placeholder="Username Please"/>						
							<label id="nameMsg"></label>
						</div>
					</div>
					<div class="username">
						<div class="left">Password:&nbsp;</div>
						<div class="right">
							<input type="password" name="password" id="pwd" placeholder="Password Please"/>
						</div>
					</div>
					<div class="username">
						<div class="left">Verify:</div>
						<div class="right">
							<input type="text" id="vcode" placeholder="verifycode please"/>
							<img src=""/><label id="checkMsg"></label>
						</div>
					</div>
					<div class="username">
						<input id="autologin" name="auto" type="checkbox" />&nbsp;&nbsp; automatically login in two weeks
						<span id="autoLoginMsg"></span>
					</div>
					<div class="login_submit">
						<input class="submit" type="submit" name="submit" value="Login" id="btn" disabled >
					</div>
					<span style="color:red">${msg}</span>
				</div>
			</div>
		</div>
	</form>
	<footer>
		<div class="copyright">blablabla</div>
		<div class="copyright">Some certificated-<img src=""/></div>
	</footer>
</body>
</html>