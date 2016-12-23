<%--
  Created by IntelliJ IDEA.
  User: Tatiana
  Date: 23.12.2016
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
          integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <link href="../resources/css/main.css" rel="stylesheet">
</head>
<body>
<%--Навигация--%>
<div class="navbar navbar-default" role="navigation">
  <div class="container-fluid">

    <div class="navbar-header">

      <a class="navbar-brand" href="/welcome">Аптечная база</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

      <ul class="nav navbar-nav navbar-right">
        <li><a href="/catalog" >Лекарства</a></li>
        <li><a href="/subscription">Подписки</a></li>
        <li><a href="/profile">Профиль</a></li>
        <li><a href="/basket">Корзина</a></li>
      </ul>
    </div>
  </div>

</div>


<div class="row">
  <div class="col-md-4"><img src="${medicine.imagePath}" class="img-circle" alt="Cinque Terre" width="304" height="236"></div>
  <div class="col-md-6">

    <table class="table table-bordered">


      <tr>
        <td>Название </td>
        <td>${medicine.nameMedicine}</td>
      </tr>
      <tr>
        <td>Грам в одной штуке</td>
        <td>${medicine.gramInOne}</td>
      </tr>
      <tr>
        <td>Консистенция</td>
        <td>${medicine.consist}</td>
      </tr>
      <tr>
        <td>О лекарстве</td>
        <td>${medicine.aboutMedicine}</td>
      </tr>
      <tr>
        <td>Срок годности</td>
        <td>${medicine.expiration_date}</td>
      </tr>
      <tr>
        <td>Состояние</td>
        <td>${medicine.state}</td>
      </tr>
      <tr>
        <td>Как применять</td>
        <td>${medicine.dosing}</td>
      </tr>

      <tr>
        <td>Опасен при</td>
        <td>${medicine.contraticions}</td>
      </tr>

    </table>
  </div>
  <%--<div class="col-md-4">.col-md-4</div>--%>
</div>
</body>
</html>
