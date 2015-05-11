<%--
  Created by IntelliJ IDEA.
  User: wahome
  Date: 5/7/15
  Time: 8:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>

<html>
  <head>
    <title>Patient Details</title>
    <link href="<c:url value='/resources/css/bootstrap/bootstrap.min.css' />" rel="stylesheet"/>
  </head>

  <body>

  <c:if test="${not empty error}">
    <div class="error">${error}</div>
  </c:if>
  <c:if test="${not empty msg}">
    <div class="msg">${msg}</div>
  </c:if>
  <c:if test="${not empty message}">
    <div class="msg">${message}</div>
  </c:if>

  <form action="<c:url value='/create' />" method='POST'>

    <input type="text" placeholder="first name" name="patient_fname" required><br>
    <input type="text" placeholder="last name" name="patient_lname" required><br>
    <input type="date" placeholder="DOB" name="patient_dob" required><br>

    <button class = "btn btn-primary"> Submit</button>

  </form>

  </body>
</html>
