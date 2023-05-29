<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="select" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 29/05/2023
  Time: 12:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Setting</h1>
    <form:form method="post" modelAttribute="setting" action="Update">
        <table border="1">
            <form:hidden path="id" value="${setting_data.id}"></form:hidden>
            <tr>
                <td>Languages</td>
                <td>
                    <form:select path="languages.languages_id" items="${languages_data}" itemLabel="languages_name" itemValue="languages_id"></form:select>
                </td>
            </tr>
            <tr>
                <td>Page Size</td>
                <td><form:select path="pageSize.pageSize_id" items="${pageSize_data}" itemLabel="PageSize_size" itemValue="pageSize_id"></form:select></td>
            </tr>
            <tr>
                <td>Spams Filter</td>
                <td><form:checkbox path="spam_filter"></form:checkbox></td>
            </tr>
            <tr>
                <td>Signature</td>
                <td><form:input path="signature" value="${setting_data.signature}"></form:input></td>
            </tr>
            <tr>
                <td><input type="reset" value="Reset"></td>
                <td><input type="submit" value="Update"></td>
            </tr>
        </table>

    </form:form>
</body>
</html>
