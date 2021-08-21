<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix ="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h2>Home Page</h2>
	<hr>
	Welcome to the Home Page
	<hr>
	<p>
		User: <security:authentication property="principal.username"/>	
		<br><br>
		Role: <security:authentication property="principal.authorities"/>	
	</p>
	<hr>
	<security:authorize access="hasRole('MANAGER')">
		<p>
			<a href="${pageContext.request.contextPath}/leaders">LeaderShip Meeting</a>
			(Only for Manager peeps)
		</p>
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')">
		<p>
			<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
			(Only for Admin peeps)
		</p>
	</security:authorize>
	<hr>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout">
	</form:form>
</body>
</html>