<?php

$uid='root';
$pwd='';
$db='testdb';
$anm = $_GET['s'];
$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";


$r=mysqli_query($con,"Select m.mno,m.mname,m.ryear,a.aname from m,a,ma where m.mno=ma.mno and a.ano=ma.ano and a.aname='$anm' "); 
echo "<table border=2>";
echo"<tr><th>Movie no</th>";
echo"<th>Movie Name</th>";
echo"<th>Release Year</th>";
echo"<th>Actor Name</th></tr>";

while($row=mysqli_fetch_array($r))
{
echo"<tr>";
echo"<th>$row[0]</th>";
echo"<th>$row[1]</th>";
echo"<th>$row[2]</th>";
echo"<th>$row[3]</th></tr>";
}

?>
