<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 29/05/2023
  Time: 6:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tờ Khai Y Tế</title>
</head>
<body>
    <h1 style="text-align: center">Tờ Khai Y Tế</h1>
    <h4 style="text-align: center">Đây là tài liệu quan trọng, thông tin của anh/chị sẽ giúp cơ quan ý tế liên lạc khi cần thiết để đề phòng chống dịch truyền nhiểm</h4>
    <form:form action="create" method="post" modelAttribute="form">
        <span>Họ và Tên</span>
        <form:input path="ho_ten"></form:input><br>
        <span>Ngày Sinh</span>
        <form:input path="ngay_sinh" plplaceholder="dd/MM/yyyy"></form:input><br>
        <span>Giới Tính</span>
        <form:input path="gioitinh"></form:input><br>
        <span>Số Điện Thoại</span>
        <form:input path="so_dien_thoai"></form:input><br>
        <input type="reset" value="Reset">
        <input type="submit" value="Register">
    </form:form>

</body>
</html>
