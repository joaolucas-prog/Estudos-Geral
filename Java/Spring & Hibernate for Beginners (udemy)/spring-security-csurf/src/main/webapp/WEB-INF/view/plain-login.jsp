<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Custom Login Page</title>
<style>
	.failure {
		color:red;
	}
</style>
</head>
<body>
	<h3>My Custom Login Page</h3>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">

		<c:if test="${param.error != null}">
			<i class="failure">Sorry! You entered invalid username/password</i>
		</c:if>
		<p>
			User name: <input type="text" name="username" />
		</p>
		<p>
			Password: <input type="text" name="password" />
		</p>
		<input type="submit" value="Login" />
	</form:form>
</body>
</html>