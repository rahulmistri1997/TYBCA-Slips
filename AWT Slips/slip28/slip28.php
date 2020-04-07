<?php
$fs=$_POST["txtfs"];
$fz=$_POST["txtfz"];
$fc=$_POST["txtfc"];
$bck=$_POST["txtbck"];
setcookie('s',$fs);
setcookie('z',$fz);
setcookie('c',$fc);
setcookie('b',$bck);
echo "$fs.<br>";
echo "$fz.<br>";
echo "$fc.<br>";
echo "$bck";
?>
<html>
<head><title>slip28</title>
</head>
<body>
<form action="slip28a.php" method="post">

<input type="submit" value="submit">
</form>
</body>
</html>
