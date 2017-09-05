<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: solncevigor
  Date: 8/12/17
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<h2>List of Books</h2>
<table>
    <tr>
        <td>Book ID</td><td>Author</td><td>Title</td><td>Price</td><td>Year</td><td></td>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${bookModel.id}</td>
            <td>${bookModel.author}</td>
            <td>${bookModel.title}</td>
            <td>${bookModel.price}</td>
            <td>${bookModel.year}</td>

            <td><a href="<c:url value='/delete-${bookModel.id}-book' />">delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="<c:url value='add_book.jsp'/>">Add New Book</a>

</body>
</html>
