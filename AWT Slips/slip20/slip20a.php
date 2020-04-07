<html>
<head>
<title>slip20a</title></head>
<body>
<?php
$a=$_GET['sub'];
if(is_null($a))
{
?>
<form action="<?php echo $_SERVER['PHP_SELF']?>"method="GET">
Select your subject: <br>
<select name="sub[]" multiple>
<option value="php">php</option>
<option value="java">java</option>
<option value="testing">Software Testing</option>
</select>
<input type="submit" name="s" value="select subject">
</form>
<?php
}
else
{
if(array_key_exists('s',$_GET))
{
$desc=join(" ",$a);
printf("your selection %s",$desc);
}
}
?>
</body>
</html>