<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.model.User" %>
    <%@ page import="java.util.List" %>
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
<table border="2">
<tr>
<td>ID</td>
<td>FNAME</td>
<td>LNAME</td>
<td>MOBILE</td>
<td>ROLE</td>
<td>USERNAME</td>
<td>PASSWORD</td>
</tr>
<%List <User>list=(List<User>)request.getAttribute("data");
for(User u:list)
{%>
<tr>
<td><%=u.getUid()  %></td>
<td><%=u.getFname() %></td>
<td><%=u.getLname() %></td>
<td><%=u.getMob() %></td>
<td><%=u.getLogin().getUname() %></td>
<td><%=u.getLogin().getPassword() %></td>
<td><%=u.getLogin().getRole().getRolename() %></td>
 </tr>
 <%} %>
</table>
</form>
</center>
</body>
</html>