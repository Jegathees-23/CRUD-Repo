<%--  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<!-- <link href='https://css.gg/arrow-left-r.css' rel='stylesheet'> -->
<style type="text/css">
    <%@include file="/WEB-INF/css/Core.css"%></style>
</head>
<body>
	<div class="main">
			<!-- Home page Design -->
		<div class="home">
			<div class="heading">
				<h1>Welcome!...</h1>
			</div>
			<div class="navbar">
				<nav>
					<ul>
						<li><a class = "active" href="#">Home</a></li>
						<li><a href="#abt">About</a></li>
						<li><a href="#cntct">Contact</a></li>
					</ul>
				</nav>
				<a href="#lgn"><img alt="SignInImg" src="file:///D:/Backup/E/Project/PROJECT1/src/main/webapp/WEB-INF/Resources/signIn.png"></a>
				<!-- <img alt="SignInImg" src="file:///D:/Backup/E/Project/PROJECT1/src/main/webapp/WEB-INF/Resources/signIn.png"> -->
			</div>
		</div>	
			<!-- About page Design -->
		<div class="about" id="abt">
			<div>
				<h2>About</h2><br>
			</div>
		</div>
			<!-- Contact page Design -->
		<div class="about" id="cntct">
			<div>
				<h2>Contact</h2><br>
			</div>
		</div>
		<!-- Login page Design -->
		<div class="login" id="lgn">
			<div class="login-container">
				<form:form action="/LoginAction">
					<!-- <div>
						<label for="userName">User Name</label>
							<input type="hidden" name="loginId"/>
							<input type="text" name="userName">
					</div> -->
				</form:form>
			</div>	
		</div>
		
	</div>
</body>
</html>