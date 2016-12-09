<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
                integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link href="<c:url value="css/main.css" />" rel="stylesheet" media="screen">


</head>
<body>

<%--Навигация--%>
<div class="navbar-default" role="navigation">
    <div class="container-fluid">

        <div class="navbar-header">

            <a class="navbar-brand" href="#">Аптечная база</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav navbar-right">
                <li><a href="/loginAnonymous" ID="HeadLoginStatus" runat="server">Логин</a></li>
                <li><a href="#">Регистрация</a></li>
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



<section id="work" class="parallax-section">

    <div class="col-md-offset-2 col-md-8 col-sm-offset-2 col-sm-8">
        <div class="section-title">
            <h1 class="heading">О НАС</h1>
            <hr>
            <p>На нашем сайте вы можете заказать лекарственные препараты,
            а так же получить информацию о их составе и способе применения.
            Так же с этим приложением вам не придется тратить время на ходьбу
            в аптеку за лекарствами.</p>
        </div>
    </div>


</section>
</body>
</html>
