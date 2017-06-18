<%@page import="com.lfa.sms.dao.impl.StudentsDAOImpl"%>
<%@page import="com.lfa.sms.dao.StudentsDAO"%>
<%@page import="com.lfa.sms.entity.Students"%>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        Students stu = new Students();
        stu.setStd_name(request.getParameter("std_name"));
        stu.setStd_address(request.getParameter("std_address"));
       
        StudentsDAO stuDAO = new StudentsDAOImpl();
        if (request.getParameter("std_id") == null) {
            stuDAO.insert(stu);
        } else {
            int id = Integer.parseInt(request.getParameter("std_id"));
            stu.setStd_id(id);
            stuDAO.update(stu);
        }
        response.sendRedirect("students.jsp");
    } else {
        out.println("<h1> Go Get the id </h1>");
    }
%>
