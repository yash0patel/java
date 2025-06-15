<div class="sorting-container" style="display: none;">
	<form action="" method="post">
		<h2>Sort Product</h2>
		<label for="columnName">Select Column : </label> 
		<select id="columnName" name="columnName">
			<option value="productID">Product ID</option>
			<option value="productName">Product Name</option>
			<option value="location">Location</option>
			<option value="type">Type</option>
			<option value="value">Value</option>
			<option value="mDate">Manufacturing Date</option>
		</select> 
		<label for="sortOrder">Sort by:</label> 
		<select id="sortOrder">
			<option value="asc">Ascending</option>
			<option value="desc">Descending</option>
		</select>
		<button class="sorting-btn" type="submit">sort</button>
		<button class="sorting-btn-cancel" type="button"
			onclick="hideAllSectionsExcept()">x</button>
	</form>
</div>