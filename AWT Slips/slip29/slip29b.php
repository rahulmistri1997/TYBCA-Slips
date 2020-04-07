<?php
$u=$_POST['u'];
$p=$_POST['p'];
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

?>