<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">

</head>
<body>
<div class="container">

<table class="table table-striped">
<caption>your todos are</caption>
<thead>
<tr>
<th>Description</th>
<th>Target Date</th>
<th>Is completed?</th>
<th></th>
</tr>
</thead>
<tbody>
<c:forEach items="${todos}" var = "todo">


<tr>
<td>${todo.desc}</td>
<td>${todo.targetDate}</td>
<td>${todo.done}</td>

<td>
							<a type="button" class="btn btn-primary" 
								href="/update-todo?id=${todo.id}">Edit</a>

							<a type="button" class="btn btn-warning" 
								href="/delete-todo?id=${todo.id}">Delete</a>
						</td></tr>
</c:forEach>
</tbody>
</table>



 <div>
 <a class="btn btn-success" href="/add-todo">Add</a>
 </div>
  </div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>