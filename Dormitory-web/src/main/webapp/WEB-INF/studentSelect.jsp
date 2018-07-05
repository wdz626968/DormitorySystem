<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.07.05
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选房界面</title>
</head>
<body>
<form action=""method="">
    <p>恭喜您登陆成功！！！</p>
    <p>在这里你可以查询房屋信息</p><br/>
    <input type="radio" name="type" value=true checked="checked"/>单间                  <!--true为单间 false为标间-->
    <input type="radio" name="type" value=false />标间<br/><br/>
    地址:<input type="text" name="address"><br/><br/>
    价格:<input type="text" name="price"><br/><br/>                      <!--true为可租 false为不可租-->
    <input type="submit" value="查询"><br/><br/>
</form>
</body>
</html>
