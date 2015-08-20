<?php
include_once '../modelo/class.crud.php';
$crud = new CRUD();
?>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="style.css" type="text/css" />
<title>Curso e Programaci&oacute;n</title>
</head>
<body>

<div id="header">
    <label>Programaci&oacute;n en PHP ->Creaci&oacute;n de un CRUD"Create, Read, Update y Delete" </label>
</div>

<center>
<table>
<tr>
<td colspan="5"><a href="add_records.php">Nuevo Regitro</a></td>
</tr>
<?php
$res = $crud->read();
if(mysql_num_rows($res)>0)
{
	while($row = mysql_fetch_array($res))
	{
	?>
    <tr>
    <td><?php echo $row['nombres']; ?></td>
    <td><?php echo $row['apellidos']; ?></td>
    <td><?php echo $row['direccion']; ?></td>
    <td><a href="edit_records.php?edt_id=<?php echo $row['id']; ?>">Editar</a></td>
    <td><a href="dbcrud.php?del_id=<?php echo $row['id']; ?>">Borrar</a></td>
    </tr>
    <?php
	}	
}
else
{
	?><tr><td colspan="5">No se han hecho registros</td></tr><?php
}
?>
</table>



</center>
</body>
</html>