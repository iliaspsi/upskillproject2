<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Subject Edit Form</title>
</head>
<body>
<h1>Edit Subject Form</h1>
<form action="savesubject" method="post">
    <table style="with: 50%">
        <tr>
            <td><input type="hidden" name="subject_id" value="${subject.subject_id}" />

            </td>
        <tr>
            <td>Subject Name</td>
            <td><input type="text" name="subject_desc" value="${subject.subject_desc}"  /></td>
        </tr>
    </table>
    <input type="submit" value="Submit" /></form>
<form action="savesubject" method="post">
<div class="container mt-5 mb-5 d-flex justify-content-center">
    <div class="card px-1 py-4">
        <div class="card-body">
            <h6 class="card-title mb-3">This appointment is for</h6>
            <h6 class="information mt-4">Please provide following information about Anz CMK</h6>
            <div class="row">
                <div class="col-sm-12">
                    <div class="form-group">
                        <input class="form-control" type="text" name="subject_desc" value="${subject.subject_desc}"> </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <div class="form-group">
                        <div class="input-group"> <input class="form-control" type="text" name="subject_desc" value="${subject.subject_desc}" > </div>
                    </div>
                </div>
            </div>
            <button class="btn btn-primary btn-block confirm-button"><input type="submit" value="Submit" /></button>
        </div>
    </div>
</div>
</form>
</body>
</html>