<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

    </style>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/resources/js/newjavascript.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" type="text/javascript"></script>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student Management System</title>
</head>
<body>

    <nav class="navbar" style="background: #c4e3f3">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="index.jsp"><img src="img/logo.png"></a>
            </div>
            <ul class="nav navbar-nav">

                <li class="active"><a href="${pageContext.request.contextPath}/index.jsp"><b>Home</b></a></li>
                <li><a href="students.jsp">Students</a></li>
                <li><a href="faculties.jsp">Faculties</a></li>
                <li><a href="courses.jsp">Courses</a></li>
                <li><a href="gallery.jsp"><b>Gallery</b></a></li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
            </form>
        </div>
    </nav>

    <div class="container">
