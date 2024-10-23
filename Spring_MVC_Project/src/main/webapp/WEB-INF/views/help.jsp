<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Help page</title>
</head>
<body>
    <h1>This is help page</h1>
    <%
        /* String name = (String) request.getAttribute("name");
        Integer rollNo = (Integer) request.getAttribute("roll");
        LocalDateTime time = (LocalDateTime) request.getAttribute("time");  */
    %>

    <h2>Hello my name is <%-- <%=name%> --%>
        ${name}
        </h2>
    <h2>My roll number is <%--<%=rollNo%>--%>   ${roll}
        </h2>
    <h2>Date and Time is <%--<%= time.toString()%>--%> ${time} </h2>
    <br>
    <hr>
    <c:forEach var="item" items="${marks}">
        <h2>${item} </h2>
    </c:forEach>
</body>
</html>
