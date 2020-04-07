<?php
$uid='root';
$pwd='';
$db='testdb';

$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";
?>


<html>
<head><title>slip21</title></head>
<body>
<form method="POST" action="<?php echo $_SERVER['PHP_SELF'];?>">
<b> Enter Hospital Name:</b>
<input type="text" name="txthnm"><br>
<input type="submit" name="submit" value="Show">
</form>

<?php
if($_SERVER['REQUEST_METHOD']=="POST")
{
if($_POST['submit']=="Show")
{
$hnm=$_POST['txthnm'];

$sql="Select d.dno,d.dname,d.addr,d.city,d.area,h.hname from d,h,dh where d.dno=dh.dno and h.hno=dh.hno and h.hname='$hnm'";
$row=mysqli_query($con,$sql);

echo "<table border=2>";
echo "<tr><th>Doc.no</th>";
echo "<th>Doc.Name</th>";
echo "<th>Address</th>";
echo "<th>City</th>";
echo "<th>Area</th>";
echo "<th>Hos.Name</th></tr>";

while($r=mysqli_fetch_array($row))
{
echo"<tr><th>$r[0]</th>";
echo "<th>$r[1]</th>";
echo "<th>$r[2]</th>";
echo "<th>$r[3]</th>";
echo "<th>$r[4]</th>";
echo "<th>$r[5]</th></tr>";
}
echo "</table>";
}
}
?>
</body>
</html>