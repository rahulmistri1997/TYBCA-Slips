<html>
<head><title>slip21a</title>
</head>
<body>
<?php
$s1=$_POST['txt1'];
?>
<form name="frm" action= "<?php echo $_SERVER['PHP_SELF'] ?> " method="post">
String1:
<input type="text" name="txt1"><br><br>
String2:
<input type="text" name="txt2"><br><br>
<input type="Submit" name="Submit">
</form>
<?php
if(!is_null($s1))
{
$s2=$_POST['txt2'];
$a=strcmp("$s1","$s2");
if($a==0)
{
echo "Strings are Equal";
}
else
{
echo "String are not Equal";
}
}
?>