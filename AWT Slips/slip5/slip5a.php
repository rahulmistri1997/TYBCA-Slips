<?php
$sr = $_GET['s'];
$mat = array();

$hnd = @fopen("slip5.dat", "r");
if ($hnd)
{
    while (!feof($hnd))
    {
        $buffer = fgets($hnd);
        if(strpos($buffer, $sr) !== FALSE)
            $mat[] = $buffer;
    }
    fclose($hnd);
}


   echo sizeof($mat) . " Matches found";
?>