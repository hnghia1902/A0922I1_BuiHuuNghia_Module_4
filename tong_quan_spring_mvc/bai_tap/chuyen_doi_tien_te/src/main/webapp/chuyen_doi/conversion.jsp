<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/05/2023
  Time: 8:15 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<form action="/conversion" method="post">
    <input type="text" name="usd"><input type="submit">
</form>
<input type="text" value="VND: ${vnd}" readonly>
</body>
</html>
