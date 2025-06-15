<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration Application</title>
<link rel="stylesheet" href="style.css">
</head>
<style>
/* nav bar css */
nav {
	display: flex;
	justify-content: space-between;
	background-color: #ffffff;
	padding: 14px;
	gap: 20px;
	box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

nav .left {
	flex-grow: 1;
}

nav button {
	display: flex;
	border: 2px solid #2980b9;
	background-color: transparent;
	color: #2980b9;
	cursor: pointer;
	border-radius: 6px;
	transition: all 0.2s ease-in-out;
	padding: 12px 24px;
}

nav button:hover {
	background-color: #2980b9;
	color: white;
}

/* main css */
.main {
	padding: 0;
	font-family: 'Arial', sans-serif;
	display: flex;
	justify-content: center;
	align-items: flex-start;
	margin: 0;
}

/* Login container */
.login-container {
	border: 2px solid #2980b9;
	background: rgba(255, 255, 255, 0.9);
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
	text-align: center;
	width: 100%;
	max-width: 400px;
	display: flex;
	flex-direction: column;
	align-items: center;
	margin-top: 10vh;
}

.login-container h2 {
	margin-bottom: 20px;
	font-size: 24px;
	color: #333;
}

/* Form styling */
.login-container form {
	display: flex;
	flex-direction: column;
	width: 100%;
	align-items: center;
}

/* Input fields */
.login-container .input-container {
	position: relative;
	width: 90%;
}

.login-container input {
	width: 100%;
	padding: 12px;
	margin: 10px 0;
	border: 1px solid #ddd;
	border-radius: 5px;
	font-size: 16px;
	transition: border-color 0.3s ease;
	text-align: center;
}

.login-container input:focus {
	border-color: #6a11cb;
	outline: none;
}

/* Checkbox for show/hide password */
.login-container .checkbox-container {
	display: flex;
	align-items: center;
	justify-content: center;
	margin-top: -5px;
	font-size: 14px;
}

.login-container .checkbox-container input {
	width: auto;
	margin-right: 5px;
}

/* Button styling */
.login-container button {
	width: 95%;
	padding: 12px;
	background: #196da7;
	color: white;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	cursor: pointer;
	transition: background 0.3s ease;
}

.login-container button:hover {
	background: #2980b9;
	color: white;
}

/* Optional: Add fade-in animation */
@keyframes fadeIn {
    from {
        opacity: 0;
    }
    to {
        opacity: 1;
    }
}

.login-container {
    animation: fadeIn 0.5s ease-out;
}
</style>
</head>
<body>
	<!-- header -->
	<%@ include file="header.jsp"%>

	<!-- Nav Bar -->
	<nav>
		<div class="left"></div>
		<button onclick="window.location.href='Login.jsp'">Login</button>
	</nav>

	<!-- main -->
	<main class="main">
		<!-- login-container -->
		<div class="login-container">
			<h2>Sign up</h2>
			<form action="SignupServlet" method="post">
				<div class="input-container">
					<span style="font-size: small; color: red;">${usernameError}</span>
					<input type="text" name="username" placeholder="User name"
						value="${usernameError == null ? userbean.username : ''}" required>
				</div>

				<div class="input-container">
					<span style="font-size: small; color: red;">${emailidError}</span>
					<input type="text" name="emailid" placeholder="Email"
						value="${emailidError == null ? userbean.emailid : ''}" required>
				</div>

				<div class="input-container">
					<span style="font-size: small; color: red;">${passwordError}</span>
					<input type="password" name="password" id="password"
						placeholder="Password"
						value="${passwordError == null ? userbean.password : ''}" required>
				</div>
				<div class="checkbox-container">
					<input type="checkbox" id="showPassword"
						onclick="document.getElementById('password').type = this.checked ? 'text' : 'password'">
					<label for="showPassword">Show Password</label>
				</div>

				<button type="submit">sign up</button>
			</form>
		</div>
	
	</main>
	<!-- Footer -->
	<%@ include file="footer.jsp"%>
</body>

</html>