<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
action="/action_page.php"
method="get" target="_blank">
<fieldset style=" margin-right:750px;">
<legend> User Form</legend>
UserId:<input type ="text"Id="userid"><br>
<br>
UserName:<input type="text" Name="name"><br>
<br>
Address:<input  type="text"Id Name="Address"><br>
<br>
Phone-no:<input type ="text"Id="phno"><br>
<br>
EmailId:<input type ="text"Id="emailid"><br>
<br>
Password:<input type ="text"Id="password"><br>
<br>
<input type="submit" value="submit">
<input type="reset"  value"cancel">
</fieldset>
</form>
</div>
<table>
<tr>
<th>UserId</th>
<th>UserName</th>
<th>Address</th>
<th>Phone-no</th>
<th>EmailId</th>
<th>Password</th>
<th>Save</th>
</tr>
<c1:forEach items="${user}" var="user">
<tr>
<td>${User.getUserId()}</td>
<td>${User.getUserName()}</td>
<td>${User.getAddress()}</td>
<td>${User.getPhone-no()}</td>
<td>${User.getEmailId()}</td>
<td>${User.getPassword()}</td>
</tr>
</c1:forEach>
</table>
</body>
</html> 