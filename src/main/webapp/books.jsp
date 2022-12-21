<%@ page import="by.suhareva.constants.AppConstants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div align="center">
    <a href="index.jsp">Home Page</a>
    <h1>Book List</h1>
    <br>
    <a href="<c:url value="<%=AppConstants.BOOK_ADD_URL%>"/>">Add Book</a>
    <br><br>

    <form method="post" action="search"/>
        <input type="text" name="title" placeholder="insert title">
        <input type="submit" value="Search">
    </form>

    <table style="background-color: aliceblue" border="">
        <tr>
            <th><a href="all">Id</a></th>
            <th><a href="sort?kind=title">Title</a></th>
            <th><a href="sort?kind=author">Author</a></th>
            <th><a href="sort?kind=year">Year</a></th>
            <th><a href="sort?kind=publisher">Publisher</a></th>
            <th><a href="sort?kind=date">Date</a></th>
            <th style="width: 200px">action</th>
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.year}</td>
                <td>${book.publisher}</td>
                <td>${book.getStringDate()}</td>
                <td>
                    <a href="<c:url value="<%=AppConstants.BOOK_READ_URL%>"/>?id=${book.id}&action=<%=AppConstants.VIEW_PARAM%>">View</a>
                    <a href="<c:url value="<%=AppConstants.BOOK_READ_URL%>"/>?id=${book.id}&action=<%=AppConstants.EDIT_PARAM%>">Edit</a>
                    <a href="<c:url value="<%=AppConstants.BOOK_DELETE_URL%>"/>?id=${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
