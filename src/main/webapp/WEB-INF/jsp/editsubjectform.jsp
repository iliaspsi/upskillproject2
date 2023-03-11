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
            <form action="savesubject" method="post">
                <div class="container mt-5 mb-5 d-flex justify-content-center">
                    <div class="card px-1 py-4">
                        <div class="card-body">
                            <h6 class="card-title mb-3">Update Person details</h6>
                            <h6 class="information mt-4">Please provide new info</h6>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <input class="form-control" type="hidden" name="subject_id" value="${subject.subject_id}"> </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <div class="input-group"> <input class="form-control" type="text" name="subject_desc" value="${subject.subject_desc}" > </div>
                                    </div>
                                </div>
                            </div>
                            <button class="btn btn-primary btn-block confirm-button" type="submit">Submit</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>