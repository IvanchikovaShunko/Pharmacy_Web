<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: IvanchikovaA--%>
  <%--Date: 09.12.2016--%>
  <%--Time: 11:54--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head runat="server">--%>
    <%--<meta charset="UTF-8">--%>
    <%--<link rel="stylesheet" href="UI/css/login.css" media="screen"  />--%>
<%--</head>--%>
<%--<body>--%>
<%--<form runat="server" role="form" action="<c:url value="/login"/>" method="post">--%>
    <%--<div class="page">--%>
        <%--<div class="header">--%>

            <%--<div class="loginDisplay">--%>

            <%--</div>--%>
            <%--<div class="clear hideSkiplink">--%>

                <%--<Items>--%>

                <%--</Items>--%>

            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="main">--%>

            <%--<div>--%>
            <%--<span class="failureNotification">--%>
            <%--</span>--%>

                <%--<div class="failureNotification">--%>
                    <%--<c:if test="${not empty error}">--%>
                        <%--<div class="error">${error}</div>--%>
                    <%--</c:if>--%>
                    <%--<c:if test="${not empty msg}">--%>
                        <%--<div class="msg">${msg}</div>--%>
                    <%--</c:if>--%>
                <%--</div>--%>

                <%--<div class="accountInfo">--%>

                    <%--<fieldset class="login">--%>
                        <%--<legend>Сведения учетной записи</legend>--%>
                        <%--<p>--%>
                            <%--<!--<span ID="UserNameLabel" runat="server" AssociatedControlID="UserName">Имя пользователя:</span>-->--%>
                            <%--<input id="login" name="login" type="text" required value="Имя пользователя" onBlur="if(this.value=='')this.value='email'" onFocus="if(this.value=='email')this.value='' ">--%>
                        <%--</p>--%>
                        <%--<p>--%>
                            <%--<input id="password" name="password" type="password" required value="Пароль" onBlur="if(this.value=='')this.value='password'" onFocus="if(this.value=='password')this.value='' ">--%>
                        <%--</p>--%>
                        <%--<p>--%>
                            <%--<Input Type="CheckBox" ID="RememberMe" runat="server">--%>
                            <%--<span ID="RememberMeLabel" runat="server" AssociatedControlID="RememberMe" CssClass="inline"></span>--%>
                        <%--</p>--%>

                    <%--</fieldset>--%>
                    <%--<p class="submitButton">--%>
                        <%--<input type="submit" ID="LoginButton" runat="server" CommandName="Login" value="Login" ValidationGroup="LoginUserValidationGroup">--%>
                    <%--</p>--%>
                <%--</div>--%>
                <%--</LayoutTemplate>--%>
            <%--</div>--%>
            <%--<div class="clear">--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="footer">--%>

        <%--</div>--%>
        <%--</div>--%>

<%--</form>--%>
<%--</body>--%>
<%--</html>--%>
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
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-login">
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="login-form" action="<c:url value="/login"/>" method="post" role="form" style="display: block;">
                                <div class="form-group">
                                    <c:if test="${not empty error}">
                                        <span class="bg-danger">${error}</span>
                                    </c:if>
                                    <c:if test="${not empty msg}">
                                        <span class="bg-success text-success">${msg}</span>
                                    </c:if>
                                    <input type="text" name="login" id="login" tabindex="1" class="form-control" placeholder="Username" value="">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
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