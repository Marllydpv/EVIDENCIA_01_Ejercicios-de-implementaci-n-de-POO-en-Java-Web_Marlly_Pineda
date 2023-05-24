<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<link href="resources/assets/css/pag.css" rel="stylesheet">

<nav>
    <div class="logo">
      <img src="resources/img/logo.png" alt="">
    </div>
    <ul class="menu">
     
      <li><a href="sevicios.jsp">Servicios</a></li>
      <li><a href="contactenos.jsp">Contactenos</a></li>
      <li><a href="index.jsp">Inicio</a></li>
      <li><a href="iniciar_sesion.jsp">iniciar Sesion</a></li>
    </ul>
  </nav>
  <form action="menu.jsp" method="POST"> 
    <link rel="stylesheet" href="menu.jsp">
    <h2>Iniciar sesión a Instagram</h2>
    <div class="input-group">
        <div class="input-group">
            <label for="username">Nombre</label>
            <input type="text" id="username" name="username" required>
          </div>
          <div class="input-group">
            <label for="username">Apellido</label>
            <input type="text" id="username" name="username" required>
          </div>
  
    <div class="input-group">
      <label for="username">Usuario</label>
      <input type="text" id="username" name="username" required>
    </div>
  
    <div class="input-group">
      <label for="password">Contraseña</label>
      <input type="password" id="password" name="password" required>
    </div>
  
    <button type="submit">Crear Cuenta</button>
  

  </form>
 
