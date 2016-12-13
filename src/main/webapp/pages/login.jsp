
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link href="../resources/css/main.css" rel="stylesheet">
</head>
<body>
<c:url value="/j_spring_security_check" var="loginUrl" />
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-login">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="login-form" action="${loginUrl}" var="loginUrl" method="post" role="form" style="display: block;">
                                <div class="form-group">
                                    <c:if test="${not empty error}">
                                        <span class="bg-danger">${error}</span>
                                    </c:if>
                                    <c:if test="${not empty msg}">
                                        <span class="bg-success text-success">${msg}</span>
                                    </c:if>
                                    <input type="text" name="j_username" id="j_username" tabindex="1" class="form-control" placeholder="Username" value="">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="j_password" id="j_password" tabindex="2" class="form-control" placeholder="Password">
                                </div>
                                <%--<div class="form-group text-center">--%>
                                <%--<input type="checkbox" tabindex="3" class="" name="remember" id="remember">--%>
                                <%--<label for="remember"> Remember Me</label>--%>
                                <%--</div>--%>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-6 col-sm-offset-3">
                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="text-center">
                                                <a href="http://phpoll.com/recover" tabindex="5" class="forgot-password">Forgot Password?</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"--%>
      <%--xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">--%>
<%--<head>--%>
    <%--<title>Spring Security Example </title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<c:url value="/j_spring_security_check" var="loginUrl" />--%>
<%--<form action="${loginUrl}" method="post">--%>
    <%--<h2 class="form-signin-heading">Please sign in</h2>--%>
    <%--<input type="text" class="form-control" name="j_username" placeholder="Login" required autofocus value="pes">--%>
    <%--<input type="password" class="form-control" name="j_password" placeholder="Password" required value="pes">--%>
    <%--<button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>