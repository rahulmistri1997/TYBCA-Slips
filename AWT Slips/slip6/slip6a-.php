<html>
<head><title>slip6a</title>
</head>
<body>

<?php
if(isset($_POST['Login']))
{
$u=$_POST['txtuid'];
$p=$_POST['txtpwd'];
$uid='root';
$pwd='';
$db='testdb';

$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";

$sql="Select * from Login where uid='$u' and pwd='$p'";
$r=mysqli_query($con,$sql); 
$n=mysqli_num_rows($r);

if($n>=1)
echo "<h3> <span style=\"color:Blue\"> Login Successful</span>";
else
echo "<h3> <span style=\"color:Red\"> Login Unsuccessful</span>";

mysqli_close($con);
}
?>
<form name="f1" method="POST" action="<?php echo $_SERVER['PHP_SELF'];?>">
<b> Enter User Id:</b>
<input type="text" name="txtuid"><br>
<b>Enter Password:</b>
<input type="text" name="txtpwd"><br>
<input type="submit" name="Login"  value="Login">
<input type="reset" value="Reset">
</form>
</body>
</html>

