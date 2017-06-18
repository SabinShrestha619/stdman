<%-- 
    Document   : course
    Created on : Jun 7, 2017, 1:50:35 PM
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
       <h1> Add Course</h1>

    <div class="form-group">
        <label>Course Name</label>
        <input type="text" name="course_name" required="required"
               placeholder="Enter Course Name" class="form-control"/>
               
    </div>
    <div class=""form-group>
      <label>Course Fees</label>
        <input type="text" name="course_code" required="required"
               placeholder="Enter Course Code" class="form-control"/>
              
   
    <button type="submit" class="btn btn-success">Save</button>
    <a href="index.jsp" class="btn btn-danger">Back</a>
    
       

</form>
    </body>
</html>
