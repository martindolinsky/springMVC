<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Title</title>
		<style><%@include file="/WEB-INF/styles/style.css"%></style>
    </head>
    <body>
        The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
        <br><br>
        Favourite programming language: ${student.language}
        <br><br>
        Operating systems:
        <ul>
            <c:forEach var="temp" items="${student.operatingSystems}">
                <li> ${temp} </li>
            </c:forEach>
        </ul>
    </body>
</html>
