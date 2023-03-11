<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Class Edit Form</title>
</head>
<body>
<h1>Edit Class Form</h1>
<form action="saveclass" method="post">
    <table style="with: 50%">
        <tr>
            <td><input type="hidden" name="class_id" value="${cls.class_id}" />

            </td>
        <tr>
            <td>Class Name</td>
            <td><input type="text" name="class_desc" value="${cls.class_desc}"  /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>