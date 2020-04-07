<?php
$uid='root';
$pwd='';
$db='testdb';
 
$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";

if($_SERVER['REQUEST_METHOD']="POST")
{
if($_POST['s']=="Insert")
{
$rn=$_POST['txtrno'];
$nm=$_POST['txtnm'];
$cls=$_POST['txtcls'];
$sql="Insert into student values($rn,'$nm','$cls')";
if(mysqli_query($con,$sql))
{
echo "New Records Created successfully";
}
else
{
echo "Error";
}

}
}

?>
<html>
<body>
<form method="POST" action = "<?php echo $_SERVER['PHP_SELF']; ?>"    > 
<b>Enter Student Details</b></br>
<b>Enter Roll No:</b><input type="text" name="txtrno"><br>
<b>Enter Name:</b><input type="text" name="txtnm"><br>
<b>Enter Class:</b><input type="text" name="txtcls"><br>
<input type="submit" name="s" value="Insert" >
</form>
</body>
</html>