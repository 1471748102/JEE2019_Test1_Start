<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/3/8
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
</head>
<body>
<h1>请输入你的账号密码</h1>
<form action="loginstruts">
    <label for="name">账号</label><br/>
    <input type="text" name="name"/>
    <br>
    <label for="password">密码</label><br/>
    <input type="password" name="pass"/>
    <br>
    <br>
    <input type="submit" value="submit"/>
</form>
</body>
</html>

