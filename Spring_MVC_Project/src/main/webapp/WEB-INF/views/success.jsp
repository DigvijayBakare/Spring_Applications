<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <%-- <h1>Hello. ${name}</h1> --%>
    <%-- <h2>Your email address is ${email} </h2> --%>
    <%-- <h2>Your password is ${pass} try to secure the password</h2> --%>

    <h1>${Header}</h1>
    <p>${Desc}</p>
    <h1 style="color: green">${msg}</h1>
    <hr>
    <h1>Hello, ${user.name}</h1>
    <h2>Your email address is ${user.email} </h2>
    <h2>Your password is ${user.pass} try to secure the password</h2>
</body>
</html>
