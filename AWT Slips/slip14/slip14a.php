<html>
<head>slip14a</title>
</head>
<body>
<?php
$rid=$_GET['id'];
if(is_null($rid))
{
?>
<table border="2"><tr><td>
<form action="<?php echo $_SERVER['PHP_SELF']?>"method="GET">
<b>Registration id :</b>
<input type="text" name="id"><br>
<b>Name :</b>
<input type="text" name="nm"><br>
<b>Address:</b>
<input type="text" name="ad"><br>
<b> phone:</b>
<input type="text" name="phno"><br>
<b>Email id:</b>
<input type="text" name="eid"><br>
<input type="submit" name="submit"><br>
</form>
</td>
</tr>
</table>
<?php
}
else
{
$rid=$_GET['id'];
$rnm=$_GET['nm'];
$rad=$_GET['ad'];
$rphno=$_GET['phno'];
$reid=$_GET['eid'];
echo"Registration id: $rid <br>";
echo"NAME: $rnm <br>";
echo"Address: $rad <br>";
echo"Phone no:$rphno <br>";
echo"Email id: $reid <br>";
}
?>
</body>
</html>


