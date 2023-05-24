<!DOCTYPE html>
<html>
<head>
    <title>Agregar Historia</title>
</head>
<body>
    <h1>Agregar Historia</h1>
    <form action="agregarHistoria" method="POST">
        <label for="titulo">Título:</label>
        <input type="text" id="titulo" name="titulo" required><br>
        <label for="contenido">Contenido:</label>
        <textarea id="contenido" name="contenido" required></textarea><br>
        <input type="submit" value="Agregar Historia">
    </form>
</body>
</html>