<%-- 
    Document   : login
    Created on : Dec 27, 2017, 10:41:16 PM
    Author     : mtnhaniv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });

                function check_username_ajax(username) {
                    $("#user-result").html('<img src="img/ajax-loader.gif" />');
                    $.post('CheckEmailServlet', {'username': username}, function (data) {
                        $("#user-result").html(data);
                    });
                }
            });
        </script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        	<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						<<form action="UsersServlet" method="POST">
                                                    <%if(request.getParameter("error")!=null){%>
                                                    <div>
                                                        <p style="color:red"><%=request.getParameter("error")%></p>
                                                    </div> 
                                                    <%}%>
                                                    <div>
                                                        <span>Username *</span>
                                                        <input type="text" name="email">
                                                    </div> 	
                                                     <div> 
                                                        <span class="word">Password *</span>
                                                        <input type="password" name="pass">
                                                    </div>			
                                                    <input type="hidden" value="login" name="command">
                                                    <input type="submit" value="Login"> 
                                                </form>
					</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User Signup!</h2>
						<form action="UsersServlet" method="POST">
                                                    <div>
                                                <span class="word">Username *</span>
                                                <input type="text" name="email" id="email">
                                                <span id="user-result"></span>
                                            </div> 	
                                            <div> 
                                                <span class="word">Password *</span>
                                                <input type="password" name="pass">
                                                <span></span>
                                            </div>			
                                            <input type="hidden" value="insert" name="command">
                                            <input type="submit" value="Register"> 
                                        </form>
                                                            </div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
