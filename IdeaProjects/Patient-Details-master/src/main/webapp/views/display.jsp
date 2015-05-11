<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wahome
  Date: 5/8/15
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Drugs</title>
      <link href="<c:url value='/resources/css/bootstrap/bootstrap.min.css' />" rel="stylesheet"/>
      <link href="<c:url value='/resources/css/fontawesome/font-awesome.min.css'/>" rel="stylesheet"/>
  </head>

  <body>
  <div class = "navbar navbar-default">Drugs List</div>
    <table>
        <tr>
          <thead>Drug ID</thead>
          <thead>Drug Name</thead>
          <thead>Patient ID</thead>
        </tr>
        <c:forEach var="list"  items="${detailsList}">
          <tr>
            <td>${list.id}</td>
            <td>${list.dname}</td>
            <td>${list.patient_id}</td>
          </tr>
        </c:forEach>
    </table>

  </body>
</html>
