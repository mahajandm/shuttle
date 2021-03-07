<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="/css/Demo.css">
</head>
<body>
<div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		
		<div class="login-form">
		<form action="/login"  method="POST">
			<div class="sign-in-htm">
				<div class="group">
					<label for="email" class="label">Email/ mobile</label>
					<input id="email" name="email" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" name="password" type="password" class="input" data-type="password" required>
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
					<a href="/src/main/webapp/WEB-INF/views/Error.jsp">About Me</a>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
			</div>
			</form>
			<form action="/signup"  method="POST">
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user" name="user_name" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<input id="pass" name="email" type="email" class="input" required>
				</div>
				<div class="group">
					<label for="tel" class="label">Mobile Number</label>  
                    <input id="tel" name="mobile" maxlength="10"  pattern="[0-9]{10}" placeholder="8726145XXX" class="input" required>  
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" name="password" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Confirm Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div>
			</div>
			</form>
		</div>
		</form>
	</div>
</div>
</body>
</html>