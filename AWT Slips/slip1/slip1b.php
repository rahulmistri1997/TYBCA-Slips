<?php
class emp
{
	var $code;
	var $name;
	var $desig;
	function emp($c,$n,$d)
	{
		$this->code=$c;
		$this->name=$n;
		$this->desig=$d;
	}
	function show1()
	{
		echo "<br>Name : $this->name";
		echo "<br> Code : $this->code";
		echo "<br> Designation : $this->desig";
		
	}
	function no()
	{
		return $this->code;
	}
}
class emp_acc extends emp
{
	var $acc_no;
	var $j_date;
	function emp_acc($acc,$jd,$c,$n,$d)
	{
		emp::emp($c,$n,$d);
		$this->acc_no=$c;
		$this->j_date=$jd;
	}
	function show2()
	{
		emp::show1();
		echo "<br> account no. : $this->acc_no";
		echo "<br> joining date : $this->j_date";
		
	}
}
class emp_sal extends emp_acc
{
	var $basic;
	var $earn;
	var $deduct;
	function emp_sal($b,$e,$ded,$acc,$jd,$c,$n,$d)
	{
		emp_acc::emp_acc($acc,$jd,$c,$n,$d);
		$this->basic=$b;
		$this->earn=$e;
		$this->deduct=$ded;
	}
	function show()
	{
		emp_acc::show2();
		echo "<br> Basic  : $this->basic";
		echo "<br> earnings : $this->earn";
		echo "<br> deductions : $this->deduct";		
	}
	function sal()
	{
		return ($this->basic+$this->earn-$this->deduct);
	}
}
$e_sal=Array();
$e_sal[0]=new emp_sal(15200,20000,3000,12345,'1-dec-2009',107,'Ivan','mumbai');
$e_sal[1]=new emp_sal(25000,20000,3000,12345,'1-dec-2008',103,'Scott','pune');
$e_sal[2]=new emp_sal(15000,20000,3000,12345,'1-dec-2009',102,'Tiger','mumbai');
$e_sal[3]=new emp_sal(10000,20000,3000,12345,'1-dec-2009',111,'Jhon','mumbai');
$e_sal[4]=new emp_sal(15500,20000,3000,12345,'1-dec-2009',114,'King','pune');
$max=$e_sal[0]->sal();
$min=$e_sal[0]->sal();
$e_max=0;
$e_min=0;
for($i=0;$i<5;$i++)
{
$e_sal[$i]->show();
echo "<br>";
$a=$e_sal[$i]->sal();
if($max<$a)
{
$max=$a;
$e_max=$i;
}
else if($min>$a)
{
$min=$a;
$e_min=$i;
}
}
echo"-------------------------------------------";
 echo "<br> Employee with max salary :";
     $e_sal[$e_max]->show();

echo"<br>-------------------------------------------";
    echo "<br> Employee with min salary :";
     $e_sal[$e_min]->show(); 
     
     
?>