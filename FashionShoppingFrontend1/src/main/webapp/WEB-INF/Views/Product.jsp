<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url value="/addproduct" var="prod"/>
<form:form action="${prod }" method="post" modelAttribute="product" enctype="Multipart/form-data">

<fieldset style=" margin-right:750px;">
<legend> Product Form</legend>
productId:<input type ="text" name="productid" path="ProductId"/><br>
<br>
product Name:<input type="text" name="productname" path="ProductName"/><br>
<br>
Price:<input type ="text" name="price" path="Prize"/><br>
<br>
Quantity:<input type ="text" name="quantity" path="QuantityInt"/><br>
<br>
Description:<input type ="text" name="quantity" path="Description"/><br>
<form:input type="file" value="upload file" path="ping"/>
<br>
<input type="submit" value="submit">
<input type="reset"  value="cancel">
</fieldset>
</form:form>

<table>
<tr>
<th>ProductImage</th>
<th>productId</th>
<th>productName</th>
<th>Price</th>
<th>Quantity</th>
<th>Edit/Delete</th>
</tr>
<c1:forEach items="${products} var="product">
<tr>
<td><img src="${img}/${product.getProductId()}.jpg" width="150px" hieght="150px"></td>
<td>${product.getProductId()}</td>
<td>${product.getProductName()}</td>
<td>${product.getPrice()}</td>
<td>${product.getQuantity()}</td>
</tr>
</c1:forEach>
</table>
</body>
</html>