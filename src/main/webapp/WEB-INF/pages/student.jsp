<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=GBK" %>
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
    <title>ѧ����Ϣ</title>
</head>
<body>
    <table>
      <tr>
        <th>���</th>
        <th>����</th>
        <th>����</th>
        <th>�Ա�</th>
        <th>�绰</th>
        <th>��ַ</th>
        <th>״̬</th>
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
