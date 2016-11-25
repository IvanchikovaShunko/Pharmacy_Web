<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
<div class="slide story" id="slide-1" data-slide="1">
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
<%--Тело--%>
<div class="container-body">
    <div class="row centered">
        <br><br>
        <div class="col-lg-4">
            <i class="fa fa-heart"></i>
            <h4>DESIGN</h4>
            <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even believable.</p>
        </div><!-- col-lg-4 -->

        <div class="col-lg-4">
            <i class="fa fa-laptop"></i>
            <h4>BOOTSTRAP</h4>
            <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even believable.</p>
        </div><!-- col-lg-4 -->

        <div class="col-lg-4">
            <i class="fa fa-trophy"></i>
            <h4>SUPPORT</h4>
            <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even believable.</p>
        </div><!-- col-lg-4 -->
    </div><!-- row -->
    <br>
    <br>
</div><!-- container -->

</body>
</html>
