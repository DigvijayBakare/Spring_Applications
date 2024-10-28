<html>
<head>
    <%@include file="./base.jsp"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <style>
            th {
                border-bottom: 2px solid #007bff;
            }
    </style>
</head>
<body>
    <div class="container mt-3">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center mb-3">Welcome to Product App</h1>
                <table class="table"  style="width: 100%;">
                  <thead class="thead-dark">
                    <tr>
                      <th scope="col">ID</th>
                      <th scope="col">Product Name</th>
                      <th scope="col">Description</th>
                      <th scope="col" style="width: 10%;">Price</th>
                      <th scope="col">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${products}" var="p">
                        <tr>
                          <th scope="row">DBI${p.id}</th>
                          <td>${p.name}</td>
                          <td>${p.description}</td>
                          <td class="font-weight-bold">&#x20B9; ${p.price}</td>
                          <td>
                            <a href="delete/${p.id}"><i class="fa-solid fa-trash-can text-danger"></i></a> &emsp13;
                            <a href="update/${p.id}"><i class="fa-solid fa-pen-nib"></i></a>
                          </td>
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>
                <div class="container text-center">
                    <a href="addProduct" class="btn btn-outline-success">Add Product</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
