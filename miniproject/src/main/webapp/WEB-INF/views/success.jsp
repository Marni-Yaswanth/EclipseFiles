<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Details you entered are : 
<br>
<br>
Registration number : ${student.regNo}
<br>
<br>
Name of the Student : ${student.name}
<br>
<br>
City of the student : ${student.city}
<br>
<br>
Contact Number of the Student : ${student.phNo}

<br>
<br>
<!-- -------caution to change  -->
Wanted to change the details ? 
<br>
<!-- -------if yes redirect to login page to modify details   -->
<form action="/login">
<input type="submit" value="yes"/>
</form>
<!-- --------if  no redirect to new page  -->
<br>
<form action="/welcome page" method="post">
<input type="submit" value="no"/>
</form>
<br>
<b>Caution : </b>If you move forward from here, You cant change your details.

</body>
</html>