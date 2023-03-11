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
<h1>Staff Register Form</h1>
<form action="saveStaff" method="post">
    <table style="with: 50%">
        <tr>
            <td><input type="hidden" name="perid" value="${person.perid}" />

            </td>
        <tr>
            <td>First Name</td>
            <td><input type="text" name="name" value="${person.name}"  /></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="surname" value="${person.surname}"/></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="text" name="email"  value="${person.email}"/></td>
        </tr>
        <tr>
            <td>Category</td>
            <td>
                <select name="category.categoryid" value="${person.category.categoryname}">
                    <option value="2">student</option>
                    <option value="1">teacher</option>
                </select>
            </td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>