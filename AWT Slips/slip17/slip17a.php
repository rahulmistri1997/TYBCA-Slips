<?php
$n=ucwords($_POST["txtnm"]);
$a=ucwords($_POST["txtad"]);
$m=$_POST["txtmn"];
$e=$_POST["txtid"];
$okay = preg_match( '/^[A-z0-9_\-]+[@][A-z0-9_\-]+([.][A-z0-9_\-]+)+[A-z.]{2,4}$/', $e);
if ($okay)
 {
   echo " Email is valid<br />";
echo "Name: $n.<br>";
echo "Address: $a.<br>";
echo "Mobile No: $m.<br>";
echo "Email Id: $e.<br>";
} 
else
 { 
echo $e." is invalid<br />";
}

