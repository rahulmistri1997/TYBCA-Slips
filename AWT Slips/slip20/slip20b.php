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
$eno=$_POST['txteno'];
$enm=$_POST['txtenm'];
$ead=$_POST['txtead'];
$epno=$_POST['txtepno'];
$esal=$_POST['txtesal'];
$dno=$_POST['txtdno'];
$sql="Insert into emp values($eno,'$enm','$ead',$epno,$esal,$dno)";
mysqli_query($con,$sql);
echo mysqli_affected_rows($con)."No of Records Inserted";
mysqli_close($con);
}
}
?>
<html><head><title>slip20b</title></head>
<body>
<form method="POST" action="<?php echo $_SERVER['PHP_SELF'];?>">
<b>Enter Employee No:</b>
<input type="text" name="txteno"><br>
<b>Enter Employee Name:</b>
<input type="text" name="txtenm"><br>
<b>Enter Address:</b>
<input type="text" name="txtead"><br>
<b>Enter Employee PHno:</b>
<input type="text" name="txtepno"><br>
<b>Enter Employee Salary:</b>
<input type="text" name="txtesal"><br>
<b>Enter DeptNo:</b>
<input type="text" name="txtdno"><br>
<input type="submit" name="s" value="Insert"> <br>
</form>

</body>
</html>


