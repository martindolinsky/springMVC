<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Student</title>
		<style><%@include file="/WEB-INF/styles/style.css"%></style>
    </head>
    <body>
        <form:form action="processForm" modelAttribute="student">
            First name: <form:input path="firstName"/>
            <br><br>
            Last name: <form:input path="lastName"/>
            <br><br>
            Country:
            <form:select path="country">
                <form:options items="${student.countryOptions}"/>
            </form:select>
            <br><br>
            Favourite language: <form:radiobuttons path="language" items="${student.languageOptions}"/>
            <br><br>
            Operating systems:
            Linux <form:checkbox path="operatingSystems" value="Linux"/>
            Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
            Windows <form:checkbox path="operatingSystems" value="Windows"/>
            <br><br>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
