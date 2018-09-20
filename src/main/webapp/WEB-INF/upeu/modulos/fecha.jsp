<%-- 
    Document   : fecha
    Created on : 16-sep-2018, 17:40:44
    Author     : TOSHIBA
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1><p> <spring:message code="welcome.fecha" arguments="${startMeeting}" /> </p></h1>
</br>
<c:if test="${!empty ListaFecha}">
   <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id Fecha</th>
      <th scope="col">Inicio Fecha</th>
      <th scope="col">Fin Fecha</th>
      <th scope="col">Costo</th>
      <th scope="col">Id Persona</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach items="${ListaFecha}" var="dato">
    <tr>
      <th scope="row">${dato.idfecha}</th>
      <td>${dato.fechainicio}</td>
      <td>${dato.fechafin}</td>
      <td>${dato.costo}</td>
      <td>${dato.idpersona}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
   </c:if>