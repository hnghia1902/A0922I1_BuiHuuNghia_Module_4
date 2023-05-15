<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 15/05/2023
  Time: 2:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form method="get" action="/save">
    <c:forEach var="item" items="${giaVi}">
        <input style="width: 10px" name="condiment" value="${item}"  type="checkbox">
        <label style="width: 40px">${item}</label>
    </c:forEach>
    <br><hr style="width: 700px; float: left" align="center"/><br>
    <input name="" value="Save" type="submit">
</form>
</body>
</html>
