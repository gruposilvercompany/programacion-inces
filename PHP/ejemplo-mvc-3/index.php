<?php
require_once 'model/database.php';

$controller = 'alumno';
// Todo esta lógica hara el papel de un FrontController
if(!isset($_REQUEST['c']))
{
    require_once "controller/$controller.controller.php";
    $controller = ucwords($controller) . 'Controller';
   // var_dump($controller);
   // die();
    $controller = new $controller;
    $controller->Index();    
}
else
{
    // Obtenemos el controlador que queremos cargar
    $controller = strtolower($_REQUEST['c']);
    $accion = isset($_REQUEST['a']) ? $_REQUEST['a'] : 'Index';
    /*var_dump($accion);
    die()*/
    
    // Instanciamos el controlador
    require_once "controller/$controller.controller.php";
    $controller = ucwords($controller) . 'Controller';
   /* var_dump($controller);
    die();*/
    $controller = new $controller;
    
    // Llama la accion
    call_user_func( array( $controller, $accion ) );
   
}