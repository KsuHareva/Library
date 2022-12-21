<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Save book</title>
    <link rel="stylesheet" href="http://localhost:8080/Library/css/style.css">

</head>
<body>

<div style="text-align: center">
    <h1>Save books</h1>
    <br>
    <span class="err-message" id="info"></span><br>
    <div align="center">
    <%--@elvariable id="book" type=""--%>
    <sf:form method="post" action="create" modelAttribute="book">
        <sf:label path="title">Title</sf:label>
        <sf:input path="title" /> <br>
       
        <sf:label path="author">Author</sf:label>
        <sf:input  path="author"/> <br>

        <sf:label path="year">Year</sf:label>
        <sf:input  path="year"/> <br>

        <sf:label path="publisher">Publisher</sf:label>
        <sf:input  path="publisher"/> <br>

        <sf:label path="text">Text</sf:label>
        <sf:input  path="text"/> <br>
        
        <input type="submit" value="save">
    </sf:form>
    </div>
</div>


<script src="http://localhost:8080/Library/js/check_form.js"></script>
</body>
</html>