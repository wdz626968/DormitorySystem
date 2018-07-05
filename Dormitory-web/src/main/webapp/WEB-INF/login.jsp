<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.07.04
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Dormitory/logSuccess.action"method="post">
    <input type="radio" name="type" value=true checked="checked"/>学生
    <input type="radio" name="type" value=false />老师<br/><br/>
    用户名:<input type="text" name="ID"><br/><br/>
    密码:<input type="password" name="password"style="padding-left: 20px"/><br/><br/>
    <input type="submit" value="提交" id="sub"><br/><br/>
</form>
</body>
</html>
