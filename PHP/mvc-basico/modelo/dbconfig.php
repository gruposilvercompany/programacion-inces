<?php
define('DB_SEVIDOR','localhost');
define('DB_USUARIO','root');
define('DB_PASSWORD','');
define('DB_BASEDATOS','mvc');

class DB_con
{
	function __construct()
	{
		$conn = mysql_connect(DB_SEVIDOR,DB_USUARIO,DB_PASSWORD) or die('Erroral al conectarce al servidor'.mysql_error());
		mysql_select_db(DB_BASEDATOS, $conn) or die('Error al conectarce a la base de datos ->'.mysql_error());
	}
}

?>