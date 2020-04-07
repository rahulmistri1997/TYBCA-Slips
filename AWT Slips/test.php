<?php
$uid='root';
$pwd='';
$db='testdb';

$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";

$sql="Select rollno,name,addr,mbno from stud";
$r=mysqli_query($con,$sql);
$n=mysqli_num_rows($r);

for($i=0;$i<$n;$i++)
{
$row=mysqli_fetch_assoc($r);
echo "Roll no".$row["rollno"]."<br>";
echo "Name".$row["name"]."<br>";
echo "Address".$row["addr"]."<br>";
echo "Mobile no".$row["mbno"]."<br>";

}
mysqli_close($con);
?>