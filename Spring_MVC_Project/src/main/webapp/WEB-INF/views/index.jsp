<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding ="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<h2>Hello World!</h2>
    <h2>This is home page</h2>
    <h2>Called by home controller</h2>
    <h2>url/home</h2>
    <%
    String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
    List<String> friends = (List<String>) request.getAttribute("friends");
    %>
    <h2>Name: <%= name %><br>
        Id: <%= id %>   </h2>

     <h3>
        <%
            for (String s : friends) {
            %>
                <h3><%=s%></h3>
            <%
            }
        %>
     </h3>

</body>
</html>
