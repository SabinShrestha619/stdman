<%-- 
    Document   : studentfaculty
    Created on : Jun 7, 2017, 2:49:16 PM
    Author     : Pravas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h3>Student Faculty</h3>
    
         <table class="table table-bordered table-striped table-hover">
            <tr>
         
    <th> Student Faculty Id <th>
    <th> FAculty Id</th>
    <th> Student Id </th>
    <th> Join Date </th>
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
