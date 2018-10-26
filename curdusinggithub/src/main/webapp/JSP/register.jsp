<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="magenda">
<center>
<form action="registeruser">
<label>Role:</label>
<select name="roleid">Select Role
<option value=1>ADMIN</option>
<option value=2>USER</option>
<option value=3>MANAGER</option>
</select><br>
<label>First Name:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="fname"><br><br>
<label>Last Name:</label>
<input type="text" name="lname"><br><br>
<label>Mobile:</label>
<input type="text" name="mob"><br><br>
<label>Username:</label>
<input type="text" name="uname"><br><br>
<label>Password:</label>
<input type="password" name="password"><br><br>
<input type="submit" value="REGISTER">
</form>
</center>
</body>
</html>