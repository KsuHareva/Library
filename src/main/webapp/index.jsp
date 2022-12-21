<%@ page import="by.suhareva.constants.AppConstants" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<div style="min-height: 500px" align="center">
    <h2>Home Page</h2>

    <a href="<c:url value="<%=AppConstants.BOOK_All_URL%>"/>">Books</a>

    <h3>Catalog:</h3><br>
    <a href="catalog?catalog=authors">Authors</a><br>

    <c:forEach var="cat" items="${authors}">
        <a href="catalog?catalog=authors&key=${cat}" style="color: darkolivegreen">${cat}</a><br>
    </c:forEach>

    <a href="catalog?catalog=publisher">Publisher</a><br>
    <c:forEach var="cat" items="${publisher}">
        <a href="catalog?catalog=publisher&key=${cat}" style="color: darkolivegreen">${cat}</a><br>
    </c:forEach>

    <a href="catalog?catalog=year">Year</a><br>
    <c:forEach var="cat" items="${year}">
        <a href="catalog?catalog=year&key=${cat}" style="color: darkolivegreen">${cat}</a><br>
    </c:forEach>

</div>
</body>
</html>
