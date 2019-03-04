<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
      <input type="password" name="password"/>
      <br>
        <br>
      <input type="submit" value="submit"/>
   </form>
</body>
</html>
