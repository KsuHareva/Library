<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit Boos</title>
</head>
<body>

<div style="text-align: center">
    <h1>Edit books</h1>
    <br>
    <div align="center">
        <form method="post" action="update" id="forma" style="width: 600px">
            <input type="hidden" name="id" value="${book.id}"><br><br>
            <input type="text" name="title" placeholder="Enter title" value="${book.title}"><br> <br>
            <input type="text" name="author" placeholder="Enter author" value="${book.author}"><br> <br>
            <input type="number" name="year" placeholder="Enter release year" value="${book.year}"><br> <br>
            <input type="text" name="publisher" placeholder="Enter publisher" value="${book.publisher}"><br> <br>
            <textarea  name="text" placeholder="Enter the text">${book.text}</textarea><br><br>
            <input type="submit" value="Edit book" >
        </form>
    </div>
</div>


</body>
</html>
