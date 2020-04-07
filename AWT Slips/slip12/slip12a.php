<?php
$n=$_POST['txtno'];
if( is_null($n))
{
?>
<html>
<head><title>slip12b</title>
</head>
<body>
<form method="POST" action="<?php echo $_SERVER['PHP_SELF'] ?>" >
<b>Enter Number:</b>
<input type="text" name="txtno"><br>
<input type="radio" name="ch" value="1"> <b>FACT</b>
<input type="radio" name="ch" value="2"> <b>Sum Of Digit</b>
<input type="submit" value="Submit">
</form>
<?php
}
else
{
$ch=$_POST['ch'];
switch($ch)
{
case 1:
$n=$_POST['txtno'];
function factorial( $n )
 {
    if ( $n == 0 )
 {
       return 1;
  }
  
  $result = ( $n * factorial( $n-1 ) );
    return $result;
}

echo "The factorial of $n is: " . factorial( $n );

break;
case 2:

while ($n>0)
{
$s=0;
while ($n>0)
{
$r=$n%10;
$s=$s+$r;
$n=$n/10;
}
if ($s>9)
{
$n=$s;
}
}
echo "Sum of Digit:$s";
}
}
?>
</body>
</html>
