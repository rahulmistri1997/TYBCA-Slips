<?php


$fnm = $_GET['f'];
// Read from file
$lines = file($fnm);
foreach($lines as $line)
{
   echo $line . "<br>";
}
?>