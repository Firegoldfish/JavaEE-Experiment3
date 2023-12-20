<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page import="java.util.List"%>
 <%@page import="java.util.ArrayList"%>

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
        <th>操作</th>
      </tr>
      <c:forEach items="${students}" var="student">
        <tr>
          <td>${student.id}</td>
          <td>${student.name}</td>
          <td>${student.age}</td>
          <td>${student.gender}</td>
          <td>${student.number}</td>
          <td>${student.address}</td>
          <td>${student.status}</td>
            <td>
                <form action="delStudent" method="post">
                    <input type="hidden" name="id" value="${student.id}">
                    <input type="submit" value="删除">
                </form>
            </td>
        </tr>
      </c:forEach>
    </table>
</body>
</html>
