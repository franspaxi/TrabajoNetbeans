<%-- 
    Document   : total
    Created on : 16-sep-2018, 17:41:18
    Author     : TOSHIBA
--%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1><p> <spring:message code="welcome.total" arguments="${startMeeting}" /> </p></h1>
</br>
<c:if test="${!empty ListaTotal}">
   <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id Total</th>
      <th scope="col">Id Persona</th>
      <th scope="col">Id Fecha</th>
      <th scope="col">Id Comida</th>
      <th scope="col">Precio Total</th>
    </tr>
  </thead>
  <tbody>
      <c:forEach items="${ListaTotal}" var="dato">
    <tr>
      <th scope="row">${dato.idtotal}</th>
      <td>${dato.idpersona}</td>
      <td>${dato.idfecha}</td>
      <td>${dato.idcomida}</td>
      <td>${dato.preciototal}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>
   </c:if>