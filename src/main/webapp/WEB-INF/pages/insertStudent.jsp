<%--
  Created by IntelliJ IDEA.
  User: bill
  Date: 12/20/23
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
  <script type="text/javascript">
    function CHECK(){
      if(form1.name.value==null||form1.name.value==''){
        document.getElementById("message").innerText="姓名不可为空";
        form1.name.focus();
        return false;
      }
      if(form1.age.value==null||form1.age.value==''){
        document.getElementById("message").innerText="年龄不可为空";
        form1.age.focus();
        return false;
        if(form1.number.value==null||form1.number.value==''){
          document.getElementById("message").innerText="联系方式不可为空";
          form1.number.focus();
          return false;
        }
        return true;
      }
    }
  </script>
</head>
<body>
<div>
  <h1>添加学生</h1>
  <h3 align="center">添加学生信息</h3>
  <form name="form1" method="post" action="insertStudent" onsubmit="return CHECK()">
    <table border=1 align="center">
      <tr></tr>
      <tr><th>姓名</th><td><input type="text" name="name" placeholder="必填*"/></td></tr>
      <tr><th>年龄</th><td><input type="text" name="age" placeholder="必填*"/></td></tr>
      <tr><th>性别</th><td><input type="text" name="gender" placeholder="必填*"/></td></tr>
      <tr><th>联系方式</th><td><input type="text" name="number" placeholder="必填*"/></td></tr>
      <tr><th>地址</th><td><input type="text" name="address" placeholder="必填*"/></td></tr>
      <tr><th>状态</th><td><input type="text" name="status" placeholder="必填*"/></td></tr>
      <tr><td><input type="submit" value="确认"><td align="center"><input type="reset" value="重写"></tr>
    </table>
  </form>
</div>
</body>
</html>
