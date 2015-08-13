<?php
require_once '../models/model.php';
class controller{
    public $model;
    public function __construct(){
        $this -> model = new model();
    }

    public function temp_index(){
         require '../views/temp_index.php';
        if($_REQUEST['submit'] == 'get_search'){
            $result = $this -> model -> get_search();
           // require 'get_search.php';
        }
    }
}?>

