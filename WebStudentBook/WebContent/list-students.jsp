<%@ page import="java.util.*,com.Ali.web.jdbc.*" %>

<html>
<head>
<title>Web Student Book</title>
</head>
<% List<Student> theStudents = (List<Student>)request.getAttribute("STUDENT_LIST"); %>
<body>
	<!-- ${STUDENT_LIST}-->
	<%= theStudents %>
</body>

</html>