<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
	The student confirmed is : ${student.firstName} ${student.lastName}
	<br><br>
	Country : ${student.country} 
	<br><br>
	Favorite Language : ${student.favoriteLanguage}
	<br><br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li> ${temp} </li>
		</c:forEach>
	</ul>
</body>
</html>