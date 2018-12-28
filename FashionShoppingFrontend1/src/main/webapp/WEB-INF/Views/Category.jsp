<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/addcat" var="cat" />
<form:form action="${cat }" method="post" modelAttribute="category">
<fieldset>
<legend> Category Form</legend>
CatId:<form:input type ="text" Id="catid" path="catId"/><br>
<br>
Cat Name:<form:input type="text" Name="name" path="catName"/><br>
<br>
<input type="submit" value="submit">
<input type="reset" value="cancel">
</fieldset>
</form:form>

<table>
<tr>
<th>CatId</th>
<th>CatName</th>
<th>Edit/Delete</th>
</tr>

<c1:forEach items="${categories}" var="Cat">
 <tr>
 <td>${cat.getCatId()}</td>
 <td>${cat.getCatName()}</td>
 </tr>
 </c1:forEach>
 </table>
 
</body>
</html>