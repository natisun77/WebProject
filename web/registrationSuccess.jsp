<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.04.2019
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

Вы успешно зарегестрированы, <% out.print(request.getAttribute("loginValue")); %>!

<form action="${pageContext.request.contextPath}/login.jsp" method="get">
    <input type="submit" value="Вход"/>
</form>

</body>
</html>
