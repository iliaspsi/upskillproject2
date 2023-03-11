<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Learners Academy</title>
    <!-- Favicon--><!-- Core theme CSS (includes Bootstrap)-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="d-flex" id="wrapper">
    <!-- Sidebar-->
    <div class="p-3 mb-2 bg-primary text-white" id="sidebar-wrapper">
        <div class="sidebar-heading border-bottom bg-primary text-white">Learn Academy</div>
        <div class="list-group list-group-flush">
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="/listStaff">List all Teachers and Students</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="/listclasses">List classes</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="/listsubjects">list subjects</a>
            <a class="list-group-item list-group-item-action list-group-item-light p-3" href="/liststudents">List Students</a>
        </div>
    </div>
    <!-- Page content wrapper-->
    <div id="page-content-wrapper">
        <!-- Top navigation-->

            <nav class="navbar navbar-expand-lg navbar-light bg-primary border-bottom">
                <ul class="navbar-nav ms-auto mt-2 mt-lg-0">
                    <li class="nav-item active"><a class="nav-link" href="/#">Home</a></li>
                </ul>

            </nav>

        <!-- Page content-->
        <div class="container-fluid">
            <input type="button" value="Add Subject"
                   onclick="window.location.href='showsubjectForm'; return false;"
                   class="btn btn-primary" />
            <br/><br/>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Subject Name</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${subjects}" var="subject">
                    <tr>
                        <td>${subject.subject_desc}</td>
                        <td>
                            <input type="button" value="Edit"
                                   onclick="window.location.href='/editsubject?id=${subject.subject_id}'; return false;"
                                   class="btn btn-primary" />
                            <input type="button" value="Delete"
                                   onclick="window.location.href='/deletesubject?id=${subject.subject_id}'; return false;"
                                   class="btn btn-primary" />
                            <input type="button" value="View Classes"
                                   onclick="window.location.href='/showclasstosubject?id=${subject.subject_id}'; return false;"
                                   class="btn btn-primary" />
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>