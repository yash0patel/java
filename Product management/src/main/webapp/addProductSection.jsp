<section class="addProduct-container" style="display: none;">
	<h2>Add Products</h2>
	<form action="" method="POST">
		<table class="productTable">
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Location</th>
					<th>Type</th>
					<th>Value</th>
					<th>Manufacturing Date</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>

				<!-- Add Product Form -->
				<tr class="addProductForm">
					<td><input type="number" id="productID" name="productID"
						required placeholder="Enter Product ID"></td>
					<td><input type="text" id="productName" name="productName"
						required placeholder="Enter Product Name"></td>
					<td><input type="text" id="location" name="location" required
						placeholder="Enter Location"></td>
					<td><input type="text" id="type" name="type" required
						placeholder="Enter Type"></td>
					<td><input type="number" id="value" name="value" required
						placeholder="Enter Value" step="0.01" min="0"></td>
					<td><input type="date" id="mDate" name="mDate" required></td>
					<td class="td-btn">
						<button type="submit">Save</button>
						<button type="reset">Cancel</button>
					</td>
				</tr>

 
		<%
    // Example data population (replace this with database connection later)
    String[][] products2 = { 
        { "101", "Laptop", "Warehouse A", "Electronics", "700", "2024-01-10" },
        { "102", "Chair", "Warehouse B", "Furniture", "150", "2023-12-20" },
        { "102", "Chair", "Warehouse B", "Furniture", "150", "2023-12-20" },
        { "102", "Chair", "Warehouse B", "Furniture", "150", "2023-12-20" },
        { "102", "Chair", "Warehouse B", "Furniture", "150", "2023-12-20" },
        { "102", "Chair", "Warehouse B", "Furniture", "150", "2023-12-20" } 
    };

    // Loop through the products array and generate table rows
    for (String[] product2 : products2) {
%>
    <tr>
        <td><%= product2[0] %></td> <!-- Product ID -->
        <td><%= product2[1] %></td> <!-- Product Name -->
        <td><%= product2[2] %></td> <!-- Warehouse -->
        <td><%= product2[3] %></td> <!-- Category -->
        <td><%= product2[4] %></td> <!-- Price -->
        <td><%= product2[5] %></td> <!-- Expiry Date -->
        <td>
            <!-- Edit and Delete links -->
            <a href="editProduct.jsp?productID=<%= product2[0] %>">Edit</a> |
            <a href="deleteProduct.jsp?productID=<%= product2[0] %>" 
               onclick="return confirm('Are you sure?')">Delete</a>
        </td>
    </tr>
<%
    }
%>        
			</tbody>
		</table>
	</form>
</section>
