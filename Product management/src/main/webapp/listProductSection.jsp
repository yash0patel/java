<%@page import="com.productmanagement.bean.Productbean"%>
<%@page import="java.util.ArrayList"%>
<section class="listProduct-container">
	<h2>Product List</h2>
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
			<%
			ArrayList<Productbean> list = (ArrayList<Productbean>) request.getAttribute("productList");
			for (Productbean p : list) {
			%>
			<tr>
				<td><%=p.getProductID()%></td>
				<td><%=p.getProductName()%></td>
				<td><%=p.getLocation()%></td>
				<td><%=p.getProductType()%></td>
				<td><%=p.getValue()%></td>
				<td><%=p.getmDate()%></td>
				<td class="td-btn">
					<button type="submit">Edit</button>
					<button type="reset">Delete</button>
				</td>

			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</section>
