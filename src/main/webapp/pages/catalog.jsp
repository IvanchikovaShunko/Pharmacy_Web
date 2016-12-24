<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: IvanchikovaA
  Date: 25.11.2016
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
          integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <link href="../resources/css/main.css" rel="stylesheet">
  <link href="../resources/css/catalog.css" rel="stylesheet">

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
        <li><a href="../index.jsp">Выход</a></li>
      </ul>
    </div>
  </div>

</div>


<div class="table-responsive container">

  <c:if test="${not empty msg}">
    <span class="bg-success text-success">${msg}</span>
  </c:if>

  <table class="table table-striped">

    <tr>
      <td></td>
      <td>Название </td>
      <td>Количество</td>
      <td>Грам в одной штуке</td>
      <td>Стоимость</td>

      <td></td>
      <td></td>
      <td></td>
    </tr>

    <c:forEach items="${medicine}" var="med">
      <tr>
        <td><img src="${med.imagePath}"/></td>
        <td>${med.nameMedicine}</td>
        <td>${med.quantity}</td>
        <td>${med.gramInOne}</td>
        <td>${med.cost}</td>
        <td>

          <form:form method="post" action="/catalog/${med.idMedicine}">
            <input type="button" class="btn btn-danger" value="добавить" formmethod="post" formaction="/catalog/${med.idMedicine}">

          </form:form>
        </td>
      <td>
        <form:form method="post" action="/catalog/${med.nameMedicine}/${med.idMedicine}">
          <input type="button" class="btn btn-warning" value="подписаться" formmethod="post" formaction="/catalog/${med.nameMedicine}/${med.idMedicine}">
        </form:form>
      </td>
        <td>
          <form:form method="get" action="/about/${med.idMedicine}">
            <input type="button" class="btn btn-success" value="узнать больше" formmethod="get" formaction="/about/${med.idMedicine}">
          </form:form>
        </td>
      </tr>
    </c:forEach>
  </table>

      </div>



</body>
</html>
