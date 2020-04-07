<?php
$uid='root';
$pwd='';
$db='testdb';

$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";
?>
<html>
<head><title>slip23b</title></head>
<body>
<form method="POST" action="<?php echo $_SERVER['PHP_SELF'];?>">
<b>Enter Bill No:<input type="text" name="txtbno"><br>
<input type="submit" name="s" value="Display">
</form>

<?php
if($_SERVER['REQUEST_METHOD']=="POST")
{
$bno=$_POST['txtbno'];
$sql="Select b.billno,b.custname,b.billdate,d.iname,d.qty,d.rate,d.discount from b,d where b.billno=d.billno and d.billno=$bno";
$row=mysqli_query($con,$sql);
echo "<table border=2>";
echo "<tr><th>Bill No</th>";
echo "<th>Cust Name</th>";
echo "<th> Bill Date</th>";
echo "<th> Item Name</th>";
echo "<th> Quantity</th>";
echo "<th> Rate</th>";
echo "<th> Discount</th></tr>";
while($r=mysqli_fetch_array($row))
{
echo"<tr><th> $r[0]</th>";
echo "<th>$r[1]</th>";
echo "<th>$r[2]</th>";
echo "<th>$r[3]</th>";
echo "<th>$r[4]</th>";
echo "<th>$r[5]</th>";
echo "<th>$r[6]</th></tr>";
}
echo "</table>";
}
?>
</body>
</html>