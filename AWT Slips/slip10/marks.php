<?php
$nm=$_POST["txtnm"];
$ad=$_POST["txtadd"];
$cls=$_POST["txtcls"];
setcookie('ns',$nm);
setcookie('as',$ad);
setcookie('cs',$cls);
$n=$_COOKIE['ns'];
$a=$_COOKIE['as'];
$c=$_COOKIE['cs'];
?>
<html>
<head><title>Marks</title></head>
<body>
<?php
$sphp=$_POST['txtphp'];
if( is_null($sphp))
{
?>
<h3> Marks Details</h3>
<form action="<?php echo $_SERVER['PHP_SELF'] ?>" method="post">
JAVA:
<input type="text" name="txtjv"><br>
PHP:
<input type="text" name="txtphp"><br>
ST:
<input type="text" name="txtst"><br>
IT:
<input type="text" name="txtrt"><br>
Practical:
<input type="text" name="txtprct"><br>
Project:
<input type="text" name="txtproj"><br>
<input type="submit" value="Submit">
</form>
<?php
}
else
{
$sjv=$_POST['txtjv'];
$sst=$_POST['txtst'];
$srt=$_POST['txtrt'];
$pract=$_POST['txtprct'];
$proj=$_POST['txtproj'];
$total=$sjv+$sphp+$sst+$srt+$pract+$proj;
$per=($total/6);
echo "Student Details .<br>";
echo "Name:= $n.<br>";
echo "Address:= $a.<br>";
echo "Class:= $c.<br>";
echo "Marks.<br>";
echo "JAVA:=$sjv.<br>";
echo "PHP:=$sphp.<br>";
echo "ST:=$sst.<br>";
echo "RT:=$srt.<br>";
echo "Practical:=$pract.<br>";
echo "Project:=$proj.<br>";
echo "Total:=$total.<br>";
echo "Percentage:=$per.<br>";
}
?>
</body>
</html>