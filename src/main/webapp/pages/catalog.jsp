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

</head>
<body>

<%--Навигация--%>
<div class="navbar navbar-default" role="navigation">
  <div class="container-fluid">

    <div class="navbar-header">

      <a class="navbar-brand" href="../index.jsp">Аптечная база</a>
    </div>

    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

      <ul class="nav navbar-nav navbar-right">
        <li><a href="catalog.jsp">Лекарства</a></li>
        <li><a href="subscription.jsp">Подписки</a></li>
        <li><a href="profile.jsp">Профиль</a></li>
        <li><a href="bag.jsp">Корзина</a></li>
      </ul>
    </div>
  </div>

</div>


<div class="table-responsive">



  <table class="table table-bordered">

    <tr>
      <td>Название </td>
      <td>Количество</td>
      <td>Грам в одной штуке</td>
      <td>Стоимость</td>
      <td></td>
    </tr>

    <c:forEach items="${medicine}" var="med">
    <tr>
      <td>${med.nameMedicine}</td>
      <td>${med.quantity}</td>
      <td>${med.gramInOne}</td>
      <td>${med.cost}</td>
      <td>

        <form:form method="post" action="/catalog/${SPRING_SECURITY_LAST_USERNAME}">
          <input type="submit" value="добавить" formmethod="post" formaction="/catalog/${SPRING_SECURITY_LAST_USERNAME}">
        </form:form>
      </td>

    </tr>
    </c:forEach>
  </table>


</div>


</body>
</html>
