<%-- 
    Document   : semester
    Created on : Jun 7, 2017, 2:47:06 PM
    Author     : Pravas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <body>
         <h2>Semesters</h2>
           <div class="pull-right">
            <p>
                <a href="addsemester.jsp" class="btn btn-primary btn-sm">
               <span class="glyphicon glyphicon-plus "> </span> Add Semester</a>
            </p>
        </div>
         <table class="table table-bordered table-striped table-hover">
            <tr>
         
    <th> Semester Id </th>
    <th> Semester Name </th>
    <th> Action </th>
            </tr>
     <td>
                    <a href="editcourse.jsp?id=" class="btn btn-success">
                        <span class="glyphicon glyphicon-pencil"></span>
                    
                    </a>
                    <a href="deletecourse.jsp?id=" class="btn btn-danger" onclick="return confirm('Are you sure to delete?')">
                        <span class="glyphicon glyphicon-trash"></span>
                    
                    </a>
                </td>
            </tr>
           
                   </table>
    </body>
</html>
