<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Management JSP</title>
    <link rel="stylesheet" href="style.css">
    <script src="EventHandling.js" defer></script>
</head>
<body>
    <!-- Header -->
    <header>
        <h1>Product Management Application</h1>
    </header>

    <!-- Navigation Bar -->
    <nav>
        <button class="navbtn" id="view-all-products">View All Products</button>
        <button class="navbtn" id="add-product">Add Product</button>
        <button class="navbtn" id="sort-product">Sort Products</button>
        <button class="navbtn" id="filter">Filter</button>
    </nav>

    <!-- Main Content -->
    <main>
        <!-- Product Table Section -->
        <%@ include file="listProductSection.jsp" %>
        <!-- Add Product Section -->
		<%@ include file="addProductSection.jsp" %>

        <!-- Sorting Section -->
        <%@ include file="sortSection.jsp" %>

        <!-- Filter Section -->
        <%@ include file="filterSection.jsp" %>
    </main>

    <!-- Footer -->
    <footer>
        <p>© 2024 Product Management Application</p>
    </footer>

</body>
</html>
