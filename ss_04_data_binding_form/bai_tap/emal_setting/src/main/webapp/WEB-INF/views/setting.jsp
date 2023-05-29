<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 29/05/2023
  Time: 12:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Setting</h1>
    <table border="1">
        <tr>

            <td>Languages</td>
            <td>Page Size</td>
            <td>Spams filter</td>
            <td>Signature</td>
            <td>Action</td>
        </tr>
        <c:forEach items="${list}" var="s">
            <tr>
                <td>${s.languages.languages_name}</td>
                <td>${s.pageSize.pageSize_size}</td>
                <td>${s.spam_filter}</td>
                <td>${s.signature}</td>
                <td><a href="edit?id=${s.id}">Edit</a></td>
            </tr>
            <tr><td><input type="number" readonly value="${s.id}"></td></tr>
        </c:forEach>
    </table>
</body>
</html>
