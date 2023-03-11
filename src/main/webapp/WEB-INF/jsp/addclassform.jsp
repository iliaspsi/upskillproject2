<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Staff Registration Form</title>
</head>
<body>
<h1>Add Class Form</h1>
<form action="saveclass" method="post">
    <table style="with: 50%">
        <tr>
            <td>Class Name</td>
            <td><input type="text" name="class_desc" /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>