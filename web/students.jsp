<%@page import="com.lfa.sms.entity.Students"%>
<%@page import="com.lfa.sms.dao.impl.StudentsDAOImpl"%>
<%@page import="com.lfa.sms.dao.StudentsDAO"%>

<div>
<!DOCTYPE html>
<html>
<head>
<h1> Students Details </h1>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
 <form action="searchStudents.jsp" method="GET">
Search By Name: <input type="text" name="Name">
    <input type ="submit" value="Search"></form>
</body>

    
    
    

<div class="pull-right">
    <p>
        <a href="addStudents.jsp" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-plus glyphicon-xs"> </span>Add Students
        </a>
    </p>
</div>
<table class="table table-bordered table-hover">
    <tr>
        <th>Student Id</th>
        <th>Name</th>
        <th>Address</th>
        <th>Action</th>
    </tr>
     <%
        StudentsDAO courseDAO = new StudentsDAOImpl();
        for (Students c : courseDAO.getAll()) {
    %>
    <tr>
        <td><%=c.getStd_id()%></td>
        <td><%=c.getStd_name()%></td>
        <td><%=c.getStd_address()%></td>
        <td><a  class="btn btn-success btn-xs">
                <span class="glyphicon glyphicon-pencil glyphicon-xs" </span> </a>
            <a class="btn btn-danger btn-xs" >
                <span class="glyphicon glyphicon-trash glyphicon-xs" </span> </a>
               
    </tr>
    <%}%>
   </table>
<%@include file="footer.jsp"%>