<%--
  Created by IntelliJ IDEA.
  User: bill
  Date: 12/23/23
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>更新学生信息</title>
  <script type="text/javascript">
    function CHECK(){
      if(form1.id.value==null||form1.id.value==''){
        document.getElementById("message").innerText="id不可为空";
        form1.id.focus();
        return false;
      }
    }
  </script>
</head>
<body>
<div>
  <h1>更新学生</h1>
  <h3 align="center">更新学生信息</h3>
  <form name="form1" method="post" action="updateStudent" onsubmit="return CHECK()">
    <table border=1 align="center">
      <tr></tr>
      <tr><th>学号</th><td><input type="text" name="id" placeholder="必填*"/></td></tr>
      <tr><th>姓名</th><td><input type="text" name="name" /></td></tr>
      <tr><th>年龄</th><td><input type="text" name="age" /></td></tr>
      <tr><th>性别</th><td><input type="text" name="gender" /></td></tr>
      <tr><th>联系方式</th><td><input type="text" name="number" /></td></tr>
      <tr><th>地址</th><td><input type="text" name="address"/></td></tr>
      <tr><th>状态</th><td><input type="text" name="status" /></td></tr>
      <tr><td><input type="submit" value="确认"><td align="center"><input type="reset" value="重写"></tr>
    </table>
  </form>
</div>
</body>
</html>
