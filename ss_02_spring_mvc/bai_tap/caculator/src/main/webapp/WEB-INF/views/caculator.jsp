<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 15/05/2023
  Time: 7:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="result" method="get">
  <input type="number" name="first_number">
  <select name="operator">
    <c:forEach items="${operator}" var="dropdown">
      <option>${dropdown}</option>
    </c:forEach>
  </select>
  <input type="number" name="second_number">
  <input type="submit" value="result">
</form>

</body>
</html>
