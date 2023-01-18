<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.AMIDAIT.com</title>



</head>

<body bgcolor="Skyblue">

<font color='green'> ${success} </font>
<font color='red'>  ${fail}</font>


<form:form action="saveUser? userid=${user.userid}"  modelAttribute="user" method="POST">



<h2>User Registration Form</h2>

  <label for="userid">User Id:</label><br>
  <input type="text" id="userid" name="userid" ><br>

  <label for="name">Full name:</label><br>
  <input type="text" id="name" name="name" ><br>
  <label for="emailid">Email Id:</label><br>
  <input type="email" id="emailid" name="emailid"><br>
    <label for="password">Password:</label><br>
  <input type="password" id="password" name="password"><br>
    <label for="MobNo">Contact No:</label><br>
  <input type="number" id="MobNo" name="MobNo"><br><br>
  
  		<button type="submit" class="btn"><b>Register</b></button>
  
  


<p>Note that the form itself is not visible.</p>

<p>Also note that the default width of text input fields is 20 characters.</p>



<a  href = "ViewUser">View All Users</a>

</form:form>


</body>
</html>