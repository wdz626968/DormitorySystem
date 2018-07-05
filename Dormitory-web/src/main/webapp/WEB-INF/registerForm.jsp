<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.06.28
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>注册界面</title>
    <script>
        function click(){
            var sub=document.getElementById("sub");
            var name=document.getElementsByName("name");
            var address=document.getElementsByName("address");
            var pNumber=document.getElementsByName("pNumber");
            var sex=document.getElementsByName("sex");
            var birth=document.getElementsByName("birth");
            var ID=document.getElementsByName("ID");
            var password=document.getElementsByName("password");
            var type=document.getElementsByName("type");
            alert(type);
                $.ajax({
                    url: "/crm/Dormitory/saveCustomer.action",
                    data: {                          //数据
                        name: name.value(),
                        pNumber: pNumber.value(),
                        address:address.value(),
                        sex: sex.value(),
                        birth: birth.value(),
                        ID:ID.value(),
                        password: password.value(),
                        type: type.value() == "学生" ? true : false
                    },
                    type: "GET",                   //类型，POST或者GET
                    dataType: 'json',              //数据返回类型，可以是xml、json等
                    success: function (data) {      //成功，回调函数
                        parent.location.reload();
                    },
                    error: function (er) {          //失败，回调函数
                        alert(data);
                    }
                })
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/Dormitory/log.action">
            <input type="radio" name="type" value=true CHECKED/>学生
            <input type="radio" name="type" value=false />老师<br/><br/>
        姓名:<input type="text" name="name"><br/><br/>
        电话:<input type="text" name="pNumber"><br/><br/>
        地址:<input type="text" name="address"><br/><br/>
        性别:<input type="text" name="sex"><br/><br/>
        生日：<input type="date" name="birth" ><br/><br/>
        用户名:<input type="text" name="ID"><br/><br/>
        密码:<input type="password" name="password"><br/><br/>
             <input type="submit" value="提交" id="sub"><br/><br/>
</form>
</body>
</html>
