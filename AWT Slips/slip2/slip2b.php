<?php
interface shape
{
	const pi=3.14;
	function area();
	function volume();
}
class cylinder implements shape
{
	var $radius;
	var $height;
	function define($r,$h)
	{
		$this->radius=$r;
		$this->height=$h;
	}
	function area()	
	{
		$a=(2*shape::pi*$this->radius*$this->height)+(2*shape::pi*$this->radius*$this->radius);
		echo "Area = $a.<br>";
	}
	function volume()
	{
		$v=shape::pi*$this->radius*$this->radius*$this->height;
		echo "<br> Volume=$v";
	}
}

	
echo "<br>Cylinder.<br>";
$c=new cylinder;
$c->define(3,4);
$c->area();
$c->volume();

?>