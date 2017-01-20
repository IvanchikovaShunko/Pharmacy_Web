<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

                <div class="form-group">
                  <input type="text" name="j_username" id="j_username" tabindex="1" class="form-control" placeholder="Username" value="">
                </div>
                <div class="form-group">
                  <input type="password" name="j_password" id="j_password" tabindex="2" class="form-control" placeholder="Password">
                  <input type="password" name="c_j_password" id="c_j_password" tabindex="2" class="form-control" placeholder="Config Password">
                </div>
                <%--<div class="form-group text-center">--%>
                <%--<input type="checkbox" tabindex="3" class="" name="remember" id="remember">--%>
                <%--<label for="remember"> Remember Me</label>--%>
                <%--</div>--%>
                <div class="form-group">
                  <div class="row">
                    <div class="col-sm-6 col-sm-offset-3">
                    <form:form method="get" action="/catalog">
                      <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="REG" formmethod="get" formaction="/catalog">
                    </form:form>
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
