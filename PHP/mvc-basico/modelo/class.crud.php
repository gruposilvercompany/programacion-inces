<?php
include_once 'dbconfig.php';

class CRUD
{
	public function __construct()
	{
		$db = new DB_con();
	}
	
	// function for create
	public function create($fname,$lname,$city)
	{
		mysql_query("INSERT INTO users(nombres,apellidos,direccion) VALUES('$fname','$lname','$city')");
	}
	// function for create
	
	// function for read
	public function read()
	{
		return mysql_query("SELECT * FROM users ORDER BY id ASC");
	}
	// function for read
	
	// function for delete
	public function delete($id)
	{
		mysql_query("DELETE FROM users WHERE id=".$id);
	}
	// function for delete
	
	// function for update
	public function update($fname,$lname,$city,$id)
	{
		mysql_query("UPDATE users SET nombres='$fname', apellidos='$lname', direccion='$city' WHERE id=".$id);
	}
	// function for update
}
?>