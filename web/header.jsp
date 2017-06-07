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
      <a class="navbar-brand" href="#">Student Management</a>
    </div>
      <ul class="nav navbar-nav">
      
        <li class="active"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
      <li><a href="students.jsp">Students</a></li>
      
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="Courses.jsp">Courses<span class="caret"></span></a>
        <ul class="dropdown-menu">
            <li><a href="#" >Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      
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
