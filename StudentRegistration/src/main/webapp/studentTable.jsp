<%@page import="com.royal.bean.Studentbean"%>
<%@page import="java.util.ArrayList"%>

<section id="studentTable-section">
	<h2>Students List</h2>
	<%
	ArrayList<Studentbean> list = (ArrayList<Studentbean>) request.getAttribute("list");

	if (list != null) {
	%>

	<table class="student-table">
		<thead>
			<tr>
				<th>Student ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Date of Birth</th>
				<th>Gender</th>
				<th>Address</th>
				<th>Course</th>
				<th>Batch Time</th>
				<th>Payment Mode</th>
				<th>Interests</th>
				<th>Registration Date</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < list.size(); i++) {
				Studentbean s = list.get(i);
			%>
			<tr>
				<td><%=s.getStudentId()%></td>
				<td><%=s.getFirstName()%></td>
				<td><%=s.getLastName()%></td>
				<td><%=s.getEmail()%></td>
				<td><%=s.getPhone()%></td>
				<td><%=s.getDob()%></td>
				<td><%=s.getGender()%></td>
				<td><%=s.getAddress()%></td>
				<td><%=s.getCourse()%></td>
				<td><%=s.getBatchTime()%></td>
				<td><%=s.getPaymentMode()%></td>
				<td><%=s.getInterests()%></td>
				<td><%=s.getRegistrationDate()%></td>
				<td class="td-btn">
					<button
						onclick="window.location.href='EditStudentServlet?rno=<%=s.getStudentId()%>'">Edit</button>
					<button
						onclick="window.location.href='DeleteStudentServlet?rno=<%=s.getStudentId()%>'">Delete</button>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<%
	} else {
	%>
	<h3 style="color: red;">No data found</h3>
	<%
	}
	%>
</section>