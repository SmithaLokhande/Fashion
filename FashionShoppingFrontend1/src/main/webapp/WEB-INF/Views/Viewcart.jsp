<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <c:url value="/resources/images" var="img"/>
    <c:url value="/resources/css" var="css"/>
      <c:url value="/resources/js" var="js"/>
      
<link rel="stylesheet" href="${css}/style.css">
<script src="${js}/script.js"></script>
</head>
<Table border="1px solid black" width="100%">
<tr>
<th>Product Image</th>
<th>Product Id</th>
<th>Product Name</th>
<th>Price</th>
<th>Actions</th>
</tr>
<c1:forEach items="${cartItems}" var="cit"> 
<tr>
<td><img width="50px" height="20px" src="<c:url value='/resources/images/${cit.getProduct().getProductId()}.jpg'/>"></td>
<td>${cit.getProduct().getProductId()} </td>
<td> ${cit.getProduct().getProductName()} </td>
<td>${cit.getPrice()}  </td>
<td><a href="">Buy</a>/<a href="">Remove</a>  </td>
</tr>
</c1:forEach>
</table>
<input type="submit"
value="BUY ALL">
<input type="reset" value="RemoveAll">
