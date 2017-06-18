<%@page import="com.lfa.sms.entity.Faculties"%>
<%@page import="com.lfa.sms.dao.impl.FacultiesDAOImpl"%>
<%@page import="com.lfa.sms.dao.FacultiesDAO"%>
<%@include file="header.jsp"%>
<h1>Faculties Details</h1>
<table class="table table-bordered table-hover">
    <tr>
        <th>Faculty Id</th>
        <th>Faculty Name</th>
        <th>Action</th>
    </tr>
     <%
        FacultiesDAO courseDAO = new FacultiesDAOImpl();
        for (Faculties c : courseDAO.getAll()) {
    %>
    <tr>
        <td><%=c.getFac_id()%></td>
        <td><%=c.getFac_name()%></td>
        <td><a  class="btn btn-success btn-xs">
                <span class="glyphicon glyphicon-pencil glyphicon-xs" </span> </a>
            <a class="btn btn-danger btn-xs" >
                <span class="glyphicon glyphicon-trash glyphicon-xs" </span> </a>
               
    </tr>
    <%}%>
   </table>
<%@include file="footer.jsp"%>
