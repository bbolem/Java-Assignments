<%@page import="java.util.Date" %>
<html>
<body>
	<form action="./login">
		User Name : <input type="text" name="username" /> 
		Password : <input type="password" name="password" />
		<input type="submit" value="login" />
	</form>
	
	<%= new Date()%>
	<%
		out.println("From login.jsp...");
	%>
</body>
</html>