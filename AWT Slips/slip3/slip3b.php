<?php
interface shape
{
	const pi=3.14;
	function area();
}
class rectangle implements shape
{
	var $width;
	var $height;
	function set($w,$h)
	{
		$this->width=$w;
		$this->height=$h;
	}
	function area()	
	{
		$r=$this->width*$this->height;
		echo "area = ".$r;
	}
}
class square extends rectangle
{
	function set($w)
	{
		rectangle::set($w,$w);
	}
	function area()	
	{
		rectangle::area();
	}
}
class circle implements shape
{
	var $rad;
	function set($r)
	{
		$this->rad=$r;
	}
	function area()
	{
		echo "area = ".$this->rad*$this->rad*shape::pi;
	}
}
$rw=$_POST["txtw"];
$rh=$_POST["txth"];
$ss=$_POST['txts'];
$cr=$_POST['txtr'];
echo "<br>Rectangle<br>";
$r=new rectangle;
$r->set($rw,$rh);
$r->area();
echo "<br><br>Square<br>";
$s=new square;
$s->set($ss);
$s->area();
echo "<br><br>Circle<br>";
$c=new circle;
$c->set($cr);
$c->area();
?>