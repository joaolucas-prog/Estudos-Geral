<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custumer Form</title>
<style>
	.error{color:red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="custumer">
		
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name*: <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		Free Passes: <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br><br>
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br><br>
		Course Code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>