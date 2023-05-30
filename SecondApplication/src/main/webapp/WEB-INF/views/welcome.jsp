<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>second application</title>
</head>
<body>
<p>this is our second application</p>
<p>and the name u entered is ${name}</p>
<p>${error}</p>
<form action="/welcome.do" method="post">
enter u r name: <input type="text" name="name">
<br>
enter u r password:
<input type="password" required name="password">
<input type="submit" value="just submit">
</form>
</body>
</html>