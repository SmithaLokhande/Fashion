<%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Signup</title>
</head>
<body>
    <c:url value="/adduser" var="add"/>
<form:form action="${add}" method="post" modelAttribute="user">
UserId:<form:input type="text" name="UserId" path="UserId"/><br>
<br>
UserName:<form:input type="text" name="UserName" path="UserName"/><br>
<br>
EmailId:<form:input type="email" name="EmailId" path="EmailId"/><br>
<br>
Password:<form:input type="password" name="password" path="Password"/><br>
<br>
Address:<form:input type=" text" name=" Address" path=" Address"/><br>
<br>
Phno:<form:input type="text" name="Phno" path="Phno"/></br>
<br>
<input type="submit" value="submit">
<input type="reset" value="cancel">
</form:form>
</body>
</html>