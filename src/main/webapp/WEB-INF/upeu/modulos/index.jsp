<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script>
    $( function() {
      $( ".widget input[type=submit], .widget a, .widget button" ).button();
      $( "button, input, a" ).click( function( event ) {
        event.preventDefault();
      } );
    } );
    </script>        
    <h1>Bienvenido al Menu del Sistema</h1>
 <a href="${pageContext.request.contextPath}/inquilin" class="btn btn-primary btn-lg active">Datos de los Inquilinos</a> <a href="${pageContext.request.contextPath}/fech" class="btn btn-primary btn-lg active">Fecha Inquilinos</a> <a href="${pageContext.request.contextPath}/comid" class="btn btn-primary btn-lg active">Comida Inquilinos</a> <a href="${pageContext.request.contextPath}/tota" class="btn btn-primary btn-lg active">Total Inquilinos</a>
    <br/>
   Mensaje:${message}
   <br/>
   
   <p> <spring:message code="welcome.greeting" arguments="${startMeeting}" /> </p> 

   <br/>
   
   