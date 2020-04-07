<?php
$uid='root';
$pwd='';
$db='testdb';
$pt=$_POST['txtp'];
$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";

$sql="Select s.seatno,s.name,s.class,s.grpno,p.ptitle from s,p where s.grpno=p.grpno and p.ptitle='$pt' ";

$r=mysqli_query($con,$sql);
$n=mysqli_num_rows($r);

for($i=0;$i<$n;$i++)
{
$row=mysqli_fetch_assoc($r);
echo "<br>Seat no: ".$row["seatno"]."<br>";
echo "Name: ".$row["name"]."<br>";
echo "Class: ".$row["class"]."<br>";
echo "Group No: ".$row["grpno"]."<br>";
echo "Project Title: ".$row["ptitle"]."<br>";

}
mysqli_close($con);
?>