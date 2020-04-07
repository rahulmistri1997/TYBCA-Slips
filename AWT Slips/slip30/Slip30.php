<?php
function get_contents() 
{
  file_get_contents("http://localhost/AWT Slips/slip30/Slip30.txt");
  var_dump( $http_response_header );
}
get_contents();
//var_dump($http_response_header);

$url = 'http://localhost/AWT Slips/slip30/Slip30.txt';

print_r (  get_headers( $url ) );
$arr = get_headers( $url );
foreach($arr as $a)
    var_dump( $a );

?>

