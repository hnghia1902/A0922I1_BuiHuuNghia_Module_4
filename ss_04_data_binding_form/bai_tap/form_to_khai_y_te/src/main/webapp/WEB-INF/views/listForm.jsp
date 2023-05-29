<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 29/05/2023
  Time: 6:34 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sách Khai Báo</h1>
<table border="1">
  <tr>
    <td>Họ và Tên</td>
    <td>Ngày Sinh</td>
    <td>Giới Tính</td>
    <td>Số Điện Thoại</td>
  </tr>
  <c:forEach items="${list}" var="l">
    <tr>
      <td>${l.ho_ten}</td>
      <td><fmt:formatDate value="${l.ngay_sinh}" pattern="dd/MM/yyyy" /></td>
      <td>${l.gioitinh}</td>
      <td>${l.so_dien_thoai}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
