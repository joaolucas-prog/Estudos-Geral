<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custumer confirmation</title>
</head>
<body>

	The Custumer is confirmed : ${custumer.firstName} ${custumer.lastName}
	<br><br>
	Free passes : ${custumer.freePasses}
	<br><br>
	Postal Code  : ${custumer.postalCode}
	<br><br>
	Course Code  : ${custumer.courseCode}
	
</body>
</html>