
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<div class = "container">
<h1>This is add to do</h1>


<form:form method="post" commandName="todo">
<form:hidden path="id"/>
<form:hidden path="user"/>
<form:hidden path="targetDate"/>
<fieldset class="form-group">
<form:label path="desc">Description</form:label>
<form:errors path="desc" cssClass="text-warning"/>
<form:input path="desc" type="text" class="form-control" required="required"></form:input>
</fieldset>

<input type="submit" class="btn btn-success" name="add" value="Submit">
</form:form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>