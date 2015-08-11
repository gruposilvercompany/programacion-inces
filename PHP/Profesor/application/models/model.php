<?php
class model{
    public function get_all(){
        $sql = "select * from tb order by id desc";
            $query = mysql_query($sql) or die(mysql_error());
            $result = array();
    while($list = mysql_fetch_array($query)){
                $result[] = $list;
            }
            return $result;
    }
    public function get_search(){
        $search = mysql_real_escape_string($_POST['search']);
        $search = trim($search);
        if($search !== ''){
            $sql = "select * from tb where ac_email like '%$search%'";
            $query = mysql_query($sql) or die(mysql_error());
            if(mysql_num_rows($query) > 0){
                $result = array();
                while($list = mysql_fetch_array($query)){
                    $result['result'][] = $list;
                }
                return $result;
            }
            else{
                $result['statu'] = 'can\'t find search';
                return $result;
            }
        }else{
            $result['statu'] = 'can\'t find search plz input text';
            return $result;
        }           
    }
}?>

