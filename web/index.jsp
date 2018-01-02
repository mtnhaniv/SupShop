<%-- 
    Document   : index
    Created on : Dec 27, 2017, 7:32:18 PM
    Author     : mtnhaniv
--%>

<%@page import="dao.ProductDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <%
            ProductDao productDAO = new ProductDao();
            String category_id = "";
            if(request.getParameter("category")!=null){
                category_id = request.getParameter("category");
            }
            %>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="banner.jsp"></jsp:include>
        <jsp:include page="content.jsp"></jsp:include>
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
