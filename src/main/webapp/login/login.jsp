<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>

</head>

<style>
    <%@include file="/WEB-INF/assets/css/style.css" %>
</style>
<body>

<div class="wrapper">


    <div class="form-login">
        <strong style="color: red">${error}</strong>

        <form method="post" action="${pageContext.request.contextPath }/login">
            <h1 class="form-heading">Login</h1>
            <div class="form-group">
                <input name="username" type="text" class="form-input" placeholder="Username">
            </div>
            <div class="form-group">
                <input name="password" type="password" class="form-input" placeholder="Password">
            </div>

            <input type="submit" value="Login" class="form-submit">

        </form>
        <form action="" method="post">
            <input type="submit" value="Register" class="form-submit">
        </form>
    </div>
</div>
</body>
</html>