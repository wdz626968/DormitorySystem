<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.07.05
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发布房屋信息</title>
</head>
<body>
<form>
    <p>恭喜您登陆成功！！！</p>
    <p>在这里你可以发布房屋信息</p><br/>
    <input type="radio" name="type" value=true checked="checked"/>单间                  <!--true为单间 false为标间-->
    <input type="radio" name="type" value=false />标间<br/><br/>
    地址:<input type="text" name="address"><br/><br/>
    价格:<input type="text" name="price"><br/><br/>
    房主用户名:<input type="test" name="ownerID"><br/><br/>
    是否可租:<input type="radio" name="type" value=true checked="checked" />可租                  <!--true为可租 false为不可租-->
    <input type="radio" name="type" value=false />不可租<br/><br/>
    <input type="submit" value="提交"><br/><br/>
</form>
</body>
</html>
