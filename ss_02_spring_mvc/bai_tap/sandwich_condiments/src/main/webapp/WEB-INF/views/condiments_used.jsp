<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 15/05/2023
  Time: 6:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Các gia vị bạn đã dùng với Sandwich bao gồm:</h1><br>
<c:forEach var="condiment" items="${condiments}">
    <label style="padding: 50px">//</label><label>${condiment}</label>
</c:forEach>



</body>
</html>
