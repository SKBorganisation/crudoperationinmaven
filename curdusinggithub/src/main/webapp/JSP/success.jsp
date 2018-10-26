<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<h1><center>**SUCCESS PAGE**</center></h1>

</head>
<body>
<center>
<form action="myform">
<table>
<tr>
<td>ID</td>
<td>FNAME</td>
<td>LNAME</td>
<td>MOBILE</td>
<td>ROLE</td>
<td>USERNAME</td>
<td>PASSWORD</td>
</tr>
<c:forEach items="${data }" var="u">
<tr>
<td>${u.uid }</td>
<td>${u.fname }</td>
<td>${u.lname }</td>
<td>${u.mob }</td>
<%-- <td>${u.login.role.rolename }</td>
<td>${u.login.uname}</td>
<td>${u.login.password }</td>
 --%></tr>
</c:forEach>
</table>
</form>
</center>
</body>
</html>