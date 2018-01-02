<%-- 
    Document   : checkout
    Created on : Dec 27, 2017, 10:50:46 PM
    Author     : mtnhaniv
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.Cart"%>
<%@page import="model.Cart"%>
<%@page import="model.Users"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            Users users = null;
            if (session.getAttribute("user") != null) {
                users = (Users) session.getAttribute("user");
            }
            if (users == null) {
                response.sendRedirect("/SupShop/login.jsp");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }

        %>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="banner.jsp"></jsp:include>
        	<div class="container">
                <div class="account">
                    <h2 class="account-in">checkout</h2>
                    <form action="CheckOutServlet" method="POST">
                        <div>
                            <span>Address *</span>
                            <input type="text" name="address">
                        </div> 	
                        <div>
                            <span>Payment *</span>
                            <select name="payment">
                                <option value="Bank transfer"> Bank transfer</option>
                                <option value="Live"> Live</option>
                            </select>
                        </div> 			
                        <input type="submit" value="Checkout"> 
                    </form>
                </div>
            </div>
                <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
