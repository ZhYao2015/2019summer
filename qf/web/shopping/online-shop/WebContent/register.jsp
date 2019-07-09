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
	</script>
<title>Register</title>
</head>
<body>
	<div class="regist">
		<div class="regist_center">
			<div class="regist_top">
				<div class="left">
					<span></span>&nbsp;&nbsp;Register here
				</div>
				<div class="right">
					<a href="index.jsp" target="_black">xiaomi demo</a>
				</div>
				<div class="clear"></div>
				<div class="xian"></div>
			</div>
			<div class="center-block">
				<form class="form-horizontal"action="userRegister" method="POST">
					<div class="form-group">
						<label class="control-label">Username</label>
						<div>
							<input type="text" id="username" name="username" class="form-control" placeholder="Username" />
						</div>
						<div>
							<p><span class="help-block" id="usernameMsg"></span></p>
						</div>
					</div>
					<div class="form-group">
						<label>Password</label>
						<div>
							<input type="password" name="password" placeholder="Password"/>
						</div>
						<div>
							<p><span id="helpBlock" class="help-block">Please enter more than 6 digits</span></p>
						</div>
					</div>
					<div class="form-group">
						<label>Password Again</label>
						<div>
							<input type="password" name="repassword" placeholder="Password Again"/>
						</div>
						<div>
							<p><span id="helpBlock" class="help-block">Passwords must be consistent</span></p>
						</div>
					</div>
					<div class="form-group">
						<label>Email</label>
						<div>
							<input type="text" name="email" placeholder="Email"/>
						</div>
						<div>
							<p><span id="helpBlock" class="help-block">Please input the correct format for emails</span></p>
						</div>
					</div>
					<div class="form-group">
						<label>Gender</label>
						<div>
							<label><input type="radio" name="gender" value="Male">Male</label>
							<label><input type="radio" name="gender" value="Female">Female</label>
						</div>
						<div>
							<p><span id="helpBlock" class="help-block">Damen oder Herren</span></p>
						</div>
					</div>
					<hr>
					<div class="form-group">
						<div>
							<input id="registerBtn" type="submit" value="register" />
							<input type="reset" value="reset" />
						</div> 
					</div>
					<div>${session.registerMsg}</div>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>