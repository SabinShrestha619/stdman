<%@page import="com.lfa.sms.entity.Courses"%>
<%@page import="com.lfa.sms.dao.impl.CoursesDAOImpl"%>
<%@page import="com.lfa.sms.dao.CoursesDAO"%>
<%@include file="header.jsp"%>
<h1> Courses </h1>
          <div class="pull-right">
            <p>
                <a href="addcourse.jsp" class="btn btn-primary btn-sm">
               <span class="glyphicon glyphicon-plus "> </span> Add Course</a>
            </p>
        </div>
         <table class="table table-bordered table-striped table-hover">
            <tr>
    <th> Course Id </th>
    <th> Course Name </th>
    <th> Course Code </th>
    <th> Action </th>
            </tr>
            
              <td>
                    <a href="editcourse.jsp?id=" class="btn btn-success">
                        <span class="glyphicon glyphicon-pencil"></span>
                    
                    </a>
                    <a href="deletecourse.jsp?id=" class="btn btn-danger" onclick="return confirm('Are you sure to delete?')">
                        <span class="glyphicon glyphicon-trash"></span>  
                </td>
            </tr>
           
                   </table>
                    
<%@include file="footer.jsp"%>