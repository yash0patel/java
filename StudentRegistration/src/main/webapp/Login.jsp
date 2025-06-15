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

.login-container {
	border: 2px solid #2980b9;
	background: rgba(255, 255, 255, 0.9);
	padding: 30px 40px;
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

.login-container form {
	display: flex;
	flex-direction: column;
	width: 100%;
	align-items: center;
}

.login-container .input-container {
	position: relative;
	width: 100%;
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

.login-container button {
	width: 100%;
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

.login-container .forgot-link {
	margin-top: 10px;
	display: block;
	text-decoration: none;
	color: #2980b9;
	width: 100%;
	text-align: right;
}

.login-container .forgot-link:hover {
	text-decoration: underline;
	cursor: pointer;
}

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
		<button onclick="window.location.href='Signup.jsp'">Sign Up</button>
	</nav>

	<!-- Main Content -->
	<main class="main">
		<div class="login-container">
			<h2>Login</h2>
			<form action="LoginServlet" method="post">
				${loginError}
				${forgetpassworderror}
				${sessionExpire}
				${message}
				<div class="input-container">
					<input type="text" id="emailid" name="emailid" placeholder="Email"
						value="${emailid != null ? emailid : ''}" required>
				</div>

				<div class="input-container">
					<input type="password" name="password" id="password"
						placeholder="Password" required>
				</div>
				<div class="checkbox-container">
					<input type="checkbox" id="showPassword"
						onclick="document.getElementById('password').type = this.checked ? 'text' : 'password'">
					<label for="showPassword">Show Password</label>
				</div>

				<button type="submit">Login</button>
				<a class="forgot-link" onclick="window.location.href='ForgotPasswordServlet?emailid=' + encodeURIComponent(document.getElementById('emailid').value)">Forgot Password?</a>
			</form>
		</div>
	</main>

	<!-- Footer -->
	<%@ include file="footer.jsp"%>
</body>
</html>
