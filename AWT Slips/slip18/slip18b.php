<?php
$tid=$_POST['txtid'];
$tnm=$_POST['txtnm'];
$ad=$_POST['txtad'];
$sub=$_POST['txtsub'];
$ch=$_POST['ch'];

if(isset($_POST['Submit']))
{

$uid='root';
$pwd='';
$db='testdb';

$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";

switch($ch)
{
case 1:
$sql ="create table teacher(tid int(5), tname varchar(20), addr varchar(20),subj varchar(20));";
if(!mysqli_query($con,"Drop Table teacher"))
echo "Table does not exists";
if(mysqli_query($con,$sql))
echo "Table Created";
break;
case 2:
$sql ="Insert into teacher values($tid,'$tnm','$ad','$sub')";
if(mysqli_query($con,$sql))
{
echo "New record created successfully";
}
else
{
echo "error" .$sql."<br>".mysqli_error($con);
}
mysqli_close($con);
break;
case 3:
$sql="Update teacher set tname='$tnm', addr='$ad', subj='$sub' where tid=$tid";
if(mysqli_query($con,$sql))
{
echo mysqli_affected_rows($con)."Record updated";
}
else
{
echo "Error".$sql."<br>".mysqli_error($con);
}
mysqli_close($con);
break;
case 4:
$sql="select * from teacher";
$r=mysqli_query($con,$sql);
$n=mysqli_num_rows($r);
for($i=0;$i<$n;$i++)
{
$row=mysqli_fetch_assoc($r);
echo "<br>Teacher no: ".$row["tid"]."<br>";
echo "Teacher name: ".$row["tname"]."<br>";
echo "Teacher address: ".$row["addr"]."<br>";
echo "Subject: ".$row["subj"]."<br>";
}
mysqli_close($con);
break;
}
}
?>