<%--
  Created by IntelliJ IDEA.
  User: Tatiana
  Date: 25.11.2016
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
          integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <link href="css/main.css" rel="stylesheet">
</head>
<body>
<%--Навигация--%>
<div class="navbar navbar-default" role="navigation">
  <div class="container-fluid">

    <div class="navbar-header">

      <a class="navbar-brand" href="#">Аптечная база</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

      <ul class="nav navbar-nav navbar-right">
        <li><a href="pages/catalog.jsp">Лекарства</a></li>
        <li><a href="pages/catalog.jsp">Подписки</a></li>
        <li><a href="pages/catalog.jsp">Профиль</a></li>
        <li><a href="pages/catalog.jsp">Корзина</a></li>
      </ul>
    </div>
  </div>

</div>


<%--Шапка--%>
<div class="slide" id="slide-1" data-slide="1">

  <div class="container">
    <div id="home-row-1" class="row clearfix">
      <div class="col-12">
        <h1 class="font-semibold">ДОБРО <span class="font-thin">ПОЖАЛОВАТЬ</span></h1>
        <h4 class="font-thin">Мы очень рады, <span class="font-semibold">что вы посетили</span> наш сайт.</h4>
        <br>
        <br>
      </div>
    </div>

  </div>
</div>
</body>
</html>
