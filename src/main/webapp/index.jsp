<html>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import='java.util.*' %>



<%@page import="com.mx.dao.*"%>
<%@page import="com.mx.entidad.*"%>
<head>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>

<!------ Include the above in your HEAD tag ---------->
<%
NovioDao dao = new NovioDao();
List<Novio> lista = new ArrayList<Novio>();

%>
<div class="container">
	<div class="row">
		<div class="span5">
            <table class="table table-striped table-condensed">
                  <thead>
                  <tr>
                      <th>Id</th>
                      <th>Nombre</th>
                      <th>App</th>
                      <th>Telefono</th>
                      <th>Trabajo</th>
                      <th>Edad</th>                                          
                  </tr>
              </thead>   
              <tbody>
                <%
                	lista = dao.mostrar();
                for(Novio n:lista)
                {
                %>
                <td><%n.getId()%></td>
                <td><%n.getNombre()%></td>
                <td><%n.getApp()%></td>
                <td><%n.getTelefono()%></td>
                <td><%n.getTrabajo()%></td>
                <td><%n.getEdad()%></td>
                <%
                }
                %>                                   
              </tbody>
            </table>
            </div>
	</div>
</div>

</body>
</html>
