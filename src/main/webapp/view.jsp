<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>View Book</title>
</head>
<body>
<h1>${book.title}</h1>
<div style="width: 500px">
    <div style="background-color: darkseagreen">
        <table style="text-align: left" >
            <tr>
                <th>ID:</th>
                <th>${book.id}</th>
            </tr>
            <tr>
                <th>AUTHOR:</th>
                <th>${book.author}</th>
            </tr>
               <tr>
                   <th>YEAR:</th>
                   <th>${book.year}</th>
               </tr>
               <tr>
                   <th>PUBLISHER:</th><t></t>
                   <th>${book.publisher}</th>
               </tr>
              <tr>
                  <th>DATE LOAD:</th><t></t>
                  <th>${book.getStringDate()}</th>
              </tr>
        </table>
    </div>
</div>
<div style="min-height: 200px">
    <p style="background-color: darkseagreen">${book.text}</p>
</div>

</body>
</html>
