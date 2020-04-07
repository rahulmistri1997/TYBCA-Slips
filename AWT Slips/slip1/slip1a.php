<html>
<body>
<?php
$n1=$_GET['no1'];
$n2=$_GET['no2'];

if(is_null($n1))
{
?>
<form action="<?php echo $_SERVER['PHP_SELF']?>"; method="GET">
Number1: <input name="no1"><br>
Number2: <input name="no2"><br>
ADDITION<input type="radio" name="rd1" value="ADD"> <br>
SUBTRACTION<input type="radio" name="rd1" value="SUB"> <br>
MUTIPLICATION<input type="radio" name="rd1" value="MUL"> <br>
DIVISION<input type="radio" name="rd1" value="DIV"> <br>
<input type="SUBMIT" value="SUBMIT"><br>
</form>
<?php
}
else
{
	$ch=$_GET['rd1'];
	switch($ch)
	{
		
		case 'ADD':
		$c=$n1+$n2;
		printf("Ans is %.2f",$c);
		break;

		case 'SUB':
		$c=$n1-$n2;
		printf("Ans is %.2f",$c);
		break;

		case 'MUL':
		$c=$n1*$n2;
		printf("Ans is %.2f",$c);
		break;

		case 'DIV':
		$c=$n1/$n2;
		printf("Ans is %.2f",$c);
	}
	}
	?>
</body>
</html>

