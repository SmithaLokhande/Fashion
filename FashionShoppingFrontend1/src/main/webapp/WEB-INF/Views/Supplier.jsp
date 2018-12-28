<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<legend> Supplier Form</legend>
<c:url value="/addsupplier" var="sup"/>
<form:form action="${sup}" method="post" modelAttribute="supplier">

SuppId:<form:input type ="text" name="SuppId" path="SuppId"/><br>
<br>
SuppName:<input type="text" name="name" path="SuppName"/><br>
<br>
SuppAddress:<input type="text" name="SuppAddress" path="SuppAddress"/><br>
<br>
PhNumber:<input type ="text" name="PhNumber" path="PhNumber"/><br>
<br> 
<input type="submit" value="submit">
<input type="reset" value"cancel">
</fieldset>
</form:form>
<table>
<tr>
<th>SupId</th>
<th>SupName</th>
<th>Address</th>
<th>Phone-no</th>
<th>EmailId</th>
<th>Edit/Delete</th>
</tr>
<c1:forEach items="${supplies}" var="supplier">
<tr>
<td>${supplier.getSupId()}</td>
<td>${supplier.getSupName()}</td>
<td>${supplier.getAddress()}</td>
<td>${supplier.getPhone-no()}</td>
<td>${supplier.getEmailId()}</td>
</tr>
</c1:forEach>
</table>
</body>
</html>