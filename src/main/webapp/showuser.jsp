<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/25
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示</title>
</head>
<body>
<table>
    <tr>
        <th>姓名</th>
        <th>ID</th>
    </tr>
    <c:forEach items="${Users}" var="User" varStatus="loop">
        <tr>
            <td>${User.name}</td>
            <td>${User.ID}</td>
            <td>1</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
