<div class="filter-container" style="display: none;">
	<form action="" method="POST">
		<h2>Filter</h2>
		<label for="filtercolumnName">Select Column : </label> 
		<select id="filtercolumnName" name="columnName">
			<option value="productID">Product ID</option>
			<option value="productName">Product Name</option>
			<option value="location">Location</option>
			<option value="type">Type</option>
			<option value="value">Value</option>
			<option value="mDate">Manufacturing Date</option>
		</select> 
		<br> 
		<label for="filterValue">Value:</label> 
		<input type="text" id="filterValue" name="filterValue" required> 
		<br>
		<button class="filter-btn" type="submit">Filter</button>
		<button class="filter-btn-cancel" type="button"
			onclick="hideAllSectionsExcept()">x</button>
	</form>
</div>