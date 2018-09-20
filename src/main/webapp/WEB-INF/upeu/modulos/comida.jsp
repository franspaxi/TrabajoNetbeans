<%-- 
    Document   : comida
    Created on : 16-sep-2018, 17:41:05
    Author     : TOSHIBA
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1><p> <spring:message code="welcome.comida" arguments="${startMeeting}" /> </p></h1>
</br>
<c:if test="${!empty ListaComida}">
   <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id Comida</th>
      <th scope="col">Desayuno</th>
      <th scope="col">Almuerzo</th>
      <th scope="col">Cena</th>
      <th scope="col">Costo</th>
      <th scope="col">Observaciones</th>
      <th scope="col">Id Persona</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach items="${ListaComida}" var="dato">
    <tr>
      <th scope="row">${dato.idcomida}</th>
      <td>${dato.desayuno}</td>
      <td>${dato.almuerzo}</td>
      <td>${dato.cena}</td>
      <td>${dato.costo}</td>
      <td>${dato.observaciones}</td>
      <td>${dato.idpersona}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
   </c:if>
