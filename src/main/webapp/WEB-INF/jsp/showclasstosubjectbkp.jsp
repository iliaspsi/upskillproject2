<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Show Subject Classes</title>
</head>
<body>
<h1>Show Subject's Classes</h1>
<form action="" method="post">
    <table style="with: 50%">
        <tr>
            <td><input type="hidden" name="subject_id" value="${subject.subject_id}" />

            </td>
        <tr>
            <td>Subject Name</td>
            <td><input type="text" name="subject_desc" value="${subject.subject_desc}"  /></td>
        </tr>
        <tr>
        <table>

            <c:forEach items="${subject.cls}" var="clsvar">
                <tr>
                <td>${clsvar.class_desc}</td>
                </tr>
            </c:forEach>
        </table>
        </tr>

    </table>
    <input type="submit" value="Submit" /></form>

</body>
</html>