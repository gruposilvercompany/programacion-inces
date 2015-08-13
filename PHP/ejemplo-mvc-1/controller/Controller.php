<?php
include_once("model/Model.php");

class Controller {
	public $model;
	
	public function __construct()  
    {  
        $this->model = new Model();

    } 
	
	public function invoke()
	{
		$books = $this->model->getBookList();
			include 'view/booklist.php';
	}
}

?>