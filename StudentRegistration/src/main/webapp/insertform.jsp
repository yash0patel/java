<%@page import="com.royal.bean.Studentbean"%>
<% 
    Boolean isEditform = (Boolean) request.getAttribute("isEditform"); 
%>
<form id="insertForm"
	action=${(isEditform != null && isEditform) ? "UpdateStudentServlet" : "InsertStudentServlet"}
	method="post">
	<h2>${(isEditform != null && isEditform) ? "Edit Student Details" : "Add Student Details"}</h2>
	<%
	Studentbean sbean = (Studentbean) request.getAttribute("sbean");
	%>
	<table class="insertForm-table">
		<tr>
			<th>Field</th>
			<th>Input</th>
		</tr>
		<tr>
			<td>Student ID:</td>
			<td class="hover-focus-effect"><input type="number"
				id="studentId" name="studentId"
				value="${sbean != null && sbean.studentId != null && sbean.studentId != 0 ? sbean.studentId : ''}"
				${isEditform != null && isEditform ?  "readonly" : ""}
				placeholder="${studentIdError != null ? studentIdError : ''}"></td>
		</tr>
		<tr>
			<td>First Name:</td>
			<td class="hover-focus-effect"><input type="text" id="firstName"
				name="firstName" value="${sbean != null ? sbean.firstName : ''}"
				placeholder="${firstNameError != null ? firstNameError : ''}"></td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td class="hover-focus-effect"><input type="text" id="lastName"
				name="lastName" value="${sbean != null ? sbean.lastName : ''}"
				placeholder="${lastNameError != null ? lastNameError : ''}"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td class="hover-focus-effect"><input type="email" id="email"
				name="email" value="${sbean != null ? sbean.email : ''}"
				placeholder="${emailError != null ? emailError : ''}"></td>
		</tr>
		<tr>
			<td>Phone:</td>
			<td class="hover-focus-effect"><input type="tel" id="phone"
				name="phone" pattern="[0-9]{10}"
				value="${sbean != null ? sbean.phone : ''}"
				placeholder="${phoneError != null ? phoneError : ''}"></td>
		</tr>
		<tr>
			<td>Date of Birth:</td>
			<td class="hover-focus-effect set-placeholder"><input
				type="date" id="dob"
				class="${sbean.dob != null ? '' : 'set-opacity-effect'}"
				style="${isSubmited != 'true' ? 'opacity: 1;' : ''}" name="dob"
				value="${sbean != null ? sbean.dob : ''}"
				placeholder="${dobError != null ? dobError : ''}"
				onclick="this.classList.remove('set-opacity-effect'); this.closest('.set-placeholder').querySelector('.font-error').style.display = 'none';">
				<font class="font-error">${dobError != null ? dobError : ''}</font>
			</td>

		</tr>
		<tr>
			<td>Gender:</td>
			<td class="display-flex set-placeholder"><font
				class="font-error">${genderError != null ? genderError : ''}</font>

				<div
					class="display-flex-gap ${sbean.gender != null ? '' : 'set-opacity-effect'}"
					style="${isSubmited != 'true' ? 'opacity: 1;' : ''}"
					onclick="this.closest('.set-placeholder').querySelectorAll('.set-opacity-effect').forEach(div => div.classList.remove('set-opacity-effect')); this.closest('.set-placeholder').querySelector('.font-error').style.display = 'none';">
					<input type="radio" id="male" name="gender" value="Male"
						${sbean != null && sbean.gender != null && sbean.gender.toLowerCase() == 'male' ? 'checked' : ''}>
					<label for="male">Male</label>
				</div>
				<div
					class="display-flex-gap ${sbean.gender != null && isSubmited == 'true' ? '' : 'set-opacity-effect'}"
					style="${isSubmited != 'true' ? 'opacity: 1;' : ''}"
					onclick="this.closest('.set-placeholder').querySelectorAll('.set-opacity-effect').forEach(div => div.classList.remove('set-opacity-effect')); this.closest('.set-placeholder').querySelector('.font-error').style.display = 'none';">
					<input type="radio" id="female" name="gender" value="Female"
						${sbean != null && sbean.gender != null && sbean.gender.toLowerCase() == 'female' ? 'checked' : ''}>
					<label for="female">Female</label>
				</div>
				<div
					class="display-flex-gap ${sbean.gender != null && isSubmited == 'true' ? '' : 'set-opacity-effect'}"
					style="${isSubmited != 'true' ? 'opacity: 1;' : ''}"
					onclick="this.closest('.set-placeholder').querySelectorAll('.set-opacity-effect').forEach(div => div.classList.remove('set-opacity-effect')); this.closest('.set-placeholder').querySelector('.font-error').style.display = 'none';">
					<input type="radio" id="other" name="gender" value="Other"
						${sbean != null && sbean.gender != null && sbean.gender.toLowerCase() == 'other' ? 'checked' : ''}>
					<label for="other">Other</label>
				</div></td>
		</tr>
		<tr>
			<td>Address:</td>
			<td><textarea id="address" name="address" rows="3" cols="30"
					placeholder="${addressError != null ? addressError : ''}">${sbean != null ? sbean.address : ''}</textarea></td>
		</tr>
		<tr>
			<td>Interests:</td>
			<td class="display-flex">
				<div class="display-flex-gap">
					<input type="checkbox" id="sports" name="interests" value="Sports"
						<%=(sbean != null && sbean.isSports()) ? "checked" : ""%>>
					<label for="sports">Sports</label>
				</div>
				<div class="display-flex-gap">
					<input type="checkbox" id="music" name="interests" value="Music"
						<%=(sbean != null && sbean.isMusic()) ? "checked" : ""%>>
					<label for="music">Music</label>
				</div>
				<div class="display-flex-gap">
					<input type="checkbox" id="debate" name="interests" value="Debate"
						<%=(sbean != null && sbean.isDebate()) ? "checked" : ""%>>
					<label for="debate">Debate</label>
				</div>
				<div class="display-flex-gap">
					<input type="checkbox" id="volunteering" name="interests"
						value="Volunteering"
						<%=(sbean != null && sbean.isVolunteering()) ? "checked" : ""%>>
					<label for="volunteering">Volunteering</label>
				</div>
			</td>
		</tr>
		<tr>
			<td>Course:</td>
			<td><select id="course" name="course">
					<option value="bca"
						<%=(sbean != null && "bca".equals(sbean.getCourse())) ? "selected" : ""%>>BCA</option>
					<option value="bsc_it"
						<%=(sbean != null && "bsc_it".equals(sbean.getCourse())) ? "selected" : ""%>>BSc
						IT</option>
					<option value="msc_it"
						<%=(sbean != null && "msc_it".equals(sbean.getCourse())) ? "selected" : ""%>>MSc
						IT</option>
					<option value="mba"
						<%=(sbean != null && "mba".equals(sbean.getCourse())) ? "selected" : ""%>>MBA</option>
					<option value="engineering"
						<%=(sbean != null && "engineering".equals(sbean.getCourse())) ? "selected" : ""%>>Engineering</option>
					<option value="other"
						<%=(sbean != null && "other".equals(sbean.getCourse())) ? "selected" : ""%>>Other</option>
			</select></td>

		</tr>
		<tr>
			<td>Batch Time:</td>
			<td><select id="batchTime" name="batchTime">
					<option value="morning"
						<%=(sbean != null && "morning".equals(sbean.getBatchTime())) ? "selected" : ""%>>Morning</option>
					<option value="afternoon"
						<%=(sbean != null && "afternoon".equals(sbean.getBatchTime())) ? "selected" : ""%>>Afternoon</option>
					<option value="evening"
						<%=(sbean != null && "evening".equals(sbean.getBatchTime())) ? "selected" : ""%>>Evening</option>
			</select></td>


		</tr>
		<tr>
			<td>Payment Mode:</td>
			<td><select id="paymentMode" name="paymentMode">
					<option value="credit_card"
						<%=(sbean != null && "credit_card".equals(sbean.getPaymentMode())) ? "selected" : ""%>>Credit
						Card</option>
					<option value="debit_card"
						<%=(sbean != null && "debit_card".equals(sbean.getPaymentMode())) ? "selected" : ""%>>Debit
						Card</option>
					<option value="net_banking"
						<%=(sbean != null && "net_banking".equals(sbean.getPaymentMode())) ? "selected" : ""%>>Net
						Banking</option>
			</select></td>
		</tr>
		<tr>
			<td class="td-btn td-btn-insertform">
    			<button
					type="<%=(isEditform != null && isEditform) ? "button" : "reset"%>"
					onclick="<%= (isEditform != null && isEditform) ? "window.location.href='EditStudentServlet?rno=" + sbean.getStudentId() + "';" : "window.location.href='addStudentDetails.jsp';" %>">
					reset
				</button>
			</td>


			<td class="td-btn td-btn-insertform">
				<button type="submit">${isEditform != null && isEditform ? "Update" : "Submit"}</button>
			</td>
		</tr>
	</table>
</form>
