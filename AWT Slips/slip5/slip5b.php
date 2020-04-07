<?php
class emp
{
	var $id;
	var $name;
	var $dept;
	var $sal;
	function emp($i,$n,$d,$s)
	{
		$this->id=$i;
		$this->name=$n;
		$this->dept=$d;
		$this->sal=$s;
	}
	function show()
	{
		echo "Name : $this->name";
		echo "<br> ID : $this->id";
		echo "<br> Department : $this->dept";
		echo "<br> Salary : $this->sal";
	}
}
class manager extends emp
{
	var $bouns;
	var $tsal;
	
	function manager($b,$i,$n,$d,$s)	
	{
		emp::emp($i,$n,$d,$s);
		$this->bouns=$b;
		$tsal=$this->bouns + $this->sal;
		$this->tsal=$tsal;
	}
	function show()
	{
		emp::show();
		echo "<br> bouns:$this->bouns";
		echo"<br> Totalsal:$this->tsal.<br>";
		echo "------------------------------------------------.<br>";
	}
}
$m=new manager(5000,101,'Smith','Computer',20000);
$m1=new manager(5000,102,'Ivan','Computer',25000);
$m2=new manager(5000,103,'King','Computer',20000);
$m3=new manager(5000,104,'Tiger','Computer',18000);
$m4=new manager(5000,105,'Jhon','Salse',15000);
$m5=new manager(5000,106,'Scott','Finance',25000);

$m->show();
$m1->show();
$m2->show();
$m3->show();
$m4->show();
$m5->show();
?>	