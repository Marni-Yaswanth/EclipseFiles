<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to the campus!</h1>
<br>
<p>Here are the courses we are providing</p>
<br>
<label for="courses" required>Choose a course:</label>

<form action="/price page" method="POST">
<select name="courses" >
<option value=""/>
  <option value="CSE">CSE</option>
  <option value="Mechanical">Mechanical</option>
  <option value="Electronics">Electronics</option>
  <option value="Civil">Civil</option>
</select>
<br>
<input type="submit" value="submit"/>
</form>
</body>
</html>