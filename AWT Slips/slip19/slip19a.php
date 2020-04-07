<html>
<head><title>slip19a</title>
</head>
<body>
<form name="frm" action= "<?php echo $_SERVER['PHP_SELF'] ?> " method="post">
String:
<input type="text" name="txt"><br><br>
<input type="Submit" name="Submit">
</form>
<?php
$s=$_POST['txt'];
$a=strrev("$s");
echo $a;
?>