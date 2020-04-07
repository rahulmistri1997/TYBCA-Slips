<html>
<head><title>slip15a</title>
</head>
<body>
<form enctype="multipart/form-data" action= "<?php echo $_SERVER['PHP_SELF']?>" method="POST">
<input type="hidden" name="upload_max_filesize" value="10240">
File Name:<input name="tfile" type="File"><br>
<input type="submit"  value="Upload">
</form>
<?php

$f=$_FILES['tfile']['name'];
$s=$_FILES['tfile']['size'];
 $t=$_FILES['tfile']['type'];
$tn=$_FILES['tfile']['tmp_name'];
 echo"Name:$f .<br>";
echo "Size:$s.<br>";
echo "Type:$t.<br>";
 echo"Temp Name:$f ";
?>
</body>
</html>