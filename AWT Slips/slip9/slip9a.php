<?php
abstract class shape
{
	const pi=3.14;
	abstract function area();
	abstract function volume();
}

class sphere extends shape
{
	var $radius;
	function set($r)
	{
		$this->radius=$r;
	}
	function area()
	{
		$as=4*shape::pi*$this->radius*$this->radius;
		echo"area=".$as;
	}
	function volume()
	{
		$vs=((4/3)*shape::pi)*$this->radius*$this->radius;
		echo"volume of sphere=".$vs;
	}

}

class cone extends shape
{
	var $rad;
	var $side;
	var $height;
	function set($ra,$s,$h)
	{
		$this->rad=$ra;
		$this->side=$s;
		$this->height=$h;
	}
	function area()
	{
		$ac=shape::pi*$this->rad*$this->side+shape::pi*$this->rad*$this->rad;
		echo"area of cone=".$ac;
	}
	function volume()
	{
		$vc=1/3*shape::pi*$this->rad*$this->rad*$this->height;
		echo"volume of cone=".$vc;
	}
	
}

class cylinder extends shape
{
	var $radi;
	var $height2;
	function set($ra,$h)
	{
		$this->radi=$ra;
		$this->height2=$h;
	}
	function area()
	{
		$acy=2*shape::pi*$this->radi*$this->radi+2*shape::pi*$this->radi*$this->height2;
		echo"area of cylinder=$acy";
	}
	function volume()
	{
		$vcy=shape::pi*$this->radi*$this->radi*$this->height2;
		echo"volume of cylinder=$vcy";
	}
}

$ob1=new sphere;
$ob1->set(2);
$ob1->area();
$ob1->volume();

$ob2=new cone;
$ob2->set(2,3,4);
$ob2->area();
$ob2->volume();

$ob3=new cylinder;
$ob3->set(3,3);
$ob3->area();
$ob3->volume();

?>

		