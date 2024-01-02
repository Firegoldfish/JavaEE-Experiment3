<%--
  Created by IntelliJ IDEA.
  User: bill
  Date: 12/19/23
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<div align="center"><span>${msg}</span></div>
<h3 align="center">请登录</h3>
<form name="form1" method="post" action="userLogin">
    <table border=1 align="center">
        <tr></tr>
        <tr><th>用户名</th><td><input type="text" name="username"/></td></tr>
        <tr><th>密码</th><td><input type="password" name="password"/></td></tr>
        <tr><td><input type="submit" value="确认"><td align="center"><input type="reset" value="重写"></tr>
    </table>
</form>
</body>
</html>
