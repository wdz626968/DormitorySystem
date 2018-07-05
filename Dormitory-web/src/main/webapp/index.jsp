<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
    <p>欢迎来到学生宿舍管理系统</p>
    <a href="${pageContext.request.contextPath}/Dormitory/login.action">登陆</a>      <!--*.action在web,xml中定义指定路径格式-->
    <a href="${pageContext.request.contextPath}/Dormitory/registerForm.action">注册</a>
</body>
</html>