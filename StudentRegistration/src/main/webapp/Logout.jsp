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
/* General styles */
.main {
	padding: 0;
	font-family: 'Arial', sans-serif;
	display: flex;
	justify-content: center;
	align-items: flex-start;
	margin: 0;
}

/* Logout container */
.logout-container {
	border: 2px solid #2980b9;
	background: rgba(255, 255, 255, 0.9);
	padding: 30px;
	border-radius: 10px;
	box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
	text-align: center;
	width: 100%;
	max-width: 400px;
	margin-top: 10vh;
}

.logout-container h2 {
	margin-bottom: 20px;
	font-size: 24px;
	color: #333;
}

/* Button styling */
.logout-container button {
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

.logout-container button:hover {
	background: #2980b9;
	color: white;
}
}
</style>
<body>
	<!-- header -->
	<%@ include file="header.jsp"%>

	<main class="main">
		<div class="logout-container">
			<h2>You have successfully logged out, ${userName != null ? userName : 'Guest'}!</h2>
			<form action="Login.jsp" method="post">
				<button type="submit">Go to Login</button>
			</form>
		</div>
	</main>
	
	<!-- Footer -->
	<%@ include file="footer.jsp"%>
</body>
</html>
