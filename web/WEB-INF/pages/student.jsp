<%--
  Created by IntelliJ IDEA.
  User: bill
  Date: 12/19/23
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息</title>
</head>
<body>
    <table>
      <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>电话</th>
        <th>地址</th>
        <th>状态</th>
      </tr>
      <c:forEach items="${students}" var="student">
        <tr>
          <th>${student.id}</th>
          <th>${student.name}</th>
          <th>${student.age}</th>
          <th>${student.gender}</th>
          <th>${student.number}</th>
          <th>${student.address}</th>
          <th>${student.status}</th>
        </tr>
      </c:forEach>
    </table>
</body>
</html>
