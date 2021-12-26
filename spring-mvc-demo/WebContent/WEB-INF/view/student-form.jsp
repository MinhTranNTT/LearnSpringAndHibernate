<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="student" method="GET">
		
		First name: <form:input path="firstName"/>
		
		Last name: <form:input path="lastName"/>
		
		<br>
		
		Country
		
		<form:select path="country">
			
			<form:options items="${student.coutryOptions}" />
			
		</form:select>
		
		<br>
		
		Favorite Languge:
		
		Java <form:radiobutton path="favoriteLanguge" value="Java" />
		PHP <form:radiobutton path="favoriteLanguge" value="PHP" />
		.NET <form:radiobutton path="favoriteLanguge" value=".NET" />
		Python <form:radiobutton path="favoriteLanguge" value="Python" />
		
		
		<br>
		
		Checkbox System:
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows" />
		
		
		
		<input type="submit" value="Submit Me!"/>
	</form:form>
	
</body>

</html>  