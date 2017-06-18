<%@include file="header.jsp" %>


<h1> Add Students</h1>
<form method="post" action="saveStudents.jsp">
    <div class="form-group">
        <label>Students Name</label> 
        <input type="text" name="std_name" required="required" 
               placeholder="Enter Students Name" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Students Address</label> 
        <input type="text" name="std_address" required="required" 
               placeholder="Enter Students address" class="form-control"/>
    </div>
</div>
  <div class="container">
        <button type="submit" class="btn btn-success btn-sm">Save</button>
        <a  href="index.jsp" class="btn btn-danger btn-sm">Cancel</a>
    </div>

</form
<%@include file="footer.jsp" %>
