<!DOCTYPE html>
<html lang="es">

<head>

  <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Agregar historia</title>


  
  <link href="resources/assets/css/pag.css" rel="stylesheet">

</head>

<body>
    
    <nav>
        <div class="logo">
          <img src="resources/img/logo.png" alt="">
        </div>
        <ul class="menu">
            <li><a href="objeto?url=redflex">inicio</a></li>
            <li><a href="objeto?url=cuenta">Cuenta</a></li>
          <li><a href="objeto?url=agregara1">agregar amigos</a></li>
        </ul>
      </nav>
      <h1 style="color:#FF6741">Agregar</h1>   
      <main>
        <div class="card-container">
            <div class="card">
              <img src="resources/img/img1.png" alt="">
              <div class="card-info">
                <h2>Agregar Historias</h2>
                <p>Comparte con tus amigos tus grandes momentos</p>
                <a href="objeto?url=agregarhistoria">Compartir Historia</a>
                <script>
                  alert(`Agregaste la historia correctamente <%=request.getAttribute("histo")%>`)
                </script>
              </div>
            </div>
            <div class="card">
                <img src="resources/img/i.png" alt="">
                <div class="card-info">
                  <h2>Eliminar historia</h2>
                  <p>+ +</p>
                  <a href="eliminarhistoria?id=eliminarhistoria">Eliminar historia</a>
                </div>
              </div>