<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: solncevigor
  Date: 8/14/17
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Add Book</h2>

<h1>
    Add a Person
</h1>

<c:url var="addAction" value="/WEB-INF/view/add_book.jsp" ></c:url>

<form:form action="${addAction}" commandName="bookModel">
    <table>
        <c:if test="${!empty bookModel.title}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="id" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="name">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="country">
                    <spring:message text="Country"/>
                </form:label>
            </td>
            <td>
                <form:input path="country" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${empty bookModel.title}">
                    <input type="submit"
                           value="<spring:message text="Add Book"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>Persons List</h3>
<c:if test="${!empty listBooks}">
    <table class="tg">
        <tr>
            <th width="80">Book ID</th>
            <th width="120">Book Author</th>
            <th width="120">Book Title</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listBooks}" var="bookModel">
            <tr>
                <td>${bookModel.id}</td>
                <td>${bookModel.author}</td>
                <td>${bookModel.title}</td>
                <td>${bookModel.price}</td>
                <td>${bookModel.year}</td>
                <td><a href="<c:url value='/remove/${bookModel.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


</body>
</html>
