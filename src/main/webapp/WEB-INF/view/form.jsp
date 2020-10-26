<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
	<style><%@include file="/WEB-INF/styles/style.css"%></style>
</head>
<body>
    <form:form action="${pageContext.request.contextPath}/form/processFormV3" method="GET">
        <input type="text" name="name" placeholder="input name"/>
        <input type="submit"/>
    </form:form>
</body>
</html>
