<%-- 
    Document   : inquilino
    Created on : 16-sep-2018, 17:40:02
    Author     : TOSHIBA
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1><p> <spring:message code="welcome.inquilino" arguments="${startMeeting}" /> </p></h1>
</br>
<c:if test="${!empty ListaPersona}">
   <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id Persona</th>
      <th scope="col">Nombre</th>
      <th scope="col">Apellido</th>
      <th scope="col">DNI</th>
      <th scope="col">Telefono</th>
      <th scope="col">Carrera</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach items="${ListaPersona}" var="dato">
    <tr>
      <th scope="row">${dato.idpersona}</th>
      <td>${dato.nombre}</td>
      <td>${dato.apellido}</td>
      <td>${dato.dni}</td>
      <td>${dato.telefono}</td>
      <td>${dato.carrera}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
   </c:if>