<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Curso e Programaci&oacute;n</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>
<body>

<div id="header">
    <label>Nuevo Reistros</label>
</div>

<center>
<form method="post" action="dbcrud.php">
<table id="dataview">
<tr>
<td><input type="text" name="fname" placeholder="Nombres" /></td>
</tr>
<tr>
<td><input type="text" name="lname" placeholder="Apellidos" /></td>
</tr>
<tr>
    <td><input type="text" name="city" placeholder="Direcci&oacute;n" /></td>
</tr>
<tr>
<td><button type="submit" name="save">Guardar</button></td>
</tr>
</table>
</form>
</center>
</body>
</html>