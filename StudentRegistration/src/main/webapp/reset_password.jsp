<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Application</title>
<link rel="stylesheet" href="style.css">
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

.resetPassword-container {
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

.resetPassword-container h2 {
	margin-bottom: 20px;
	font-size: 24px;
	color: #333;
}

.resetPassword-container .psw-input {
	width: 100%;
	padding: 12px;
	margin: 10px 0;
	border: 1px solid #ddd;
	border-radius: 5px;
	font-size: 16px;
	transition: border-color 0.3s ease;
	text-align: center;
}

.resetPassword-container .psw-input input:focus {
	border-color: #6a11cb;
	outline: none;
}

.resetPassword-container .btn {
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

.resetPassword-container .btn:hover {
	background: #2980b9;
	color: white;
}

.resetPassword-container .checkbox-container {
	display: flex;
	align-items: center;
	justify-content: center;
	margin-top: -5px;
	font-size: small;
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
		<button onclick="window.location.href='Signup.jsp'">Sign Up</button>

	</nav>

	<!-- Main Content -->
	<main class="main">
		<div class="resetPassword-container">
			<h2>Reset Your Password</h2>
			<form action="ResetPasswordServlet" method="post">
				<span style="font-size: smaller; color: red; display: block;">${passwordError}</span>
				<label for="newPassword">New Password:</label> 
				<input type="password" class="psw-input" id="newPassword" name="newPassword" value=${newPassword}>
				<div class="checkbox-container">
					<input type="checkbox" id="shownewPassword"
						onclick="document.getElementById('newPassword').type = this.checked ? 'text' : 'password'">
					<label for="shownewPassword">Show Password</label>
				</div>
				
				<br> 
				<br> 
				
				<span style="font-size: smaller; color: red; display: block;">${error}</span>
				<label for="rePassword">Re-enter New Password:</label> 
				<input type="password" class="psw-input" id="rePassword" name="rePassword">
				<div class="checkbox-container">
					<input type="checkbox" id="showrePassword"
						onclick="document.getElementById('rePassword').type = this.checked ? 'text' : 'password'">
					<label for="showrePassword">Show Password</label>
				</div>
				<br> 
				<br>

				<button class="btn" type="submit">Reset Password</button>
			</form>
		</div>
	</main>

	<!-- Footer -->
	<%@ include file="footer.jsp"%>
</body>
</html>