<?php
$nm=$_POST["txtnm"];
$ad=$_POST["txtadd"];
$mno=$_POST["txtmbno"];
setcookie('ns',$nm);
setcookie('as',$ad);
setcookie('ms',$mno);
$n=$_COOKIE['ns'];
$a=$_COOKIE['as'];
$m=$_COOKIE['ms'];
?>
<html>
<head><title> LIC</title></head>
<body>
<?php
$pno=$_POST['txtpno'];
if( is_null($pno))
{
?>
<form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="post">
Policy_No:
<input type="text" name="txtpno"><br>
Name:
<input type="text" name="txtpnm"><br>
Premium:
<input type="text" name="txtpre"><br>
<input type="submit" value="Submit">
</form>
<?php
}
else
{
$pnm=$_POST['txtpnm'];
$pre=$_POST['txtpre'];
echo "Employee Details .<br>";
echo "Name:= $n.<br>";
echo "Address:= $a.<br>";
echo "Mobile No:= $m.<br>";
echo "LIC Details.<br>";
echo "Policy no:=$pno.<br>";
echo "Name:=$pnm.<br>";
echo "premium:=$pre.<br>";
}
?>
</body>
</html>