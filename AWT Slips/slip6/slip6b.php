<?php
class vehicle
{
	var $cid;
	var $came;
	var $price;
	function vehicle($id,$cn,$p)
	{
		$this->cid=$id;
		$this->cname=$cn;
		$this->price=$p;
	}
	
}
class lightmotorvehicle  extends vehicle
{
	var $mileage;	
	function lightmotorvehicle($m,$id,$cn,$p)	
	{
		vehicle::vehicle($id,$cn,$p);
		$this->mileage=$m;
	}

function show()
	{ 
echo "---Light Motor Vehicle--- <br>";
?>
<html>
<head>
<title>slib6b</title>
</head>
	<body>
	<table border=2>
<tr>
<th><?php echo "CID "?></th>
<th><?php echo "Cname "?></th>
<th><?php echo "Price "?></th>
<th><?php echo "Mileage "?></th>
</tr>
<tr>
<td><?php echo  $this->cid ?></td>
<td><?php echo  $this->cname ?></td>
<td><?php echo  $this->price ?></td>
<td><?php echo $this->mileage?></td>
</tr>
</table>
<?php
	}
}
class heavymotorvehicle  extends vehicle
{
	var $cap;	
	function heavymotorvehicle($c,$id,$cn,$p)	
	{
		vehicle::vehicle($id,$cn,$p);
		$this->cap=$c;
	}

function show()
	{ 
echo "---Heavy Motor Vehicle--- <br>";
?>

	<table border=2>
<tr>
<th><?php echo "CID "?></th>
<th><?php echo "Cname "?></th>
<th><?php echo "Price "?></th>
<th><?php echo "Capacity "?></th>
</tr>
<tr>
<td><?php echo  $this->cid ?></td>
<td><?php echo  $this->cname ?></td>
<td><?php echo  $this->price ?></td>
<td><?php echo $this->cap?></td>
</tr>
</table>

</body>
</html>
<?php
	}
}
$lv=new lightmotorvehicle(50,101,'Tata',2000000);
$lv1=new lightmotorvehicle(60,102,'Ford',4000000);
$lv2=new lightmotorvehicle(40,103,'Nissan',5000000);
$lv3=new lightmotorvehicle(50,104,'Mahindra',2000000);
$lv4=new lightmotorvehicle(30,105,'TVS',2000000);
$lv->show();
$lv1->show();
$lv2->show();
$lv3->show();
$lv4->show();
$hv=new heavymotorvehicle(500,101,'Tata',2000000);
$hv1=new heavymotorvehicle(600,102,'Ford',4000000);
$hv2=new heavymotorvehicle(400,103,'Nissan',5000000);
$hv3=new heavymotorvehicle(500,104,'Mahindra',2000000);
$hv4=new heavymotorvehicle(300,105,'TVS',2000000);
$hv->show();
$hv1->show();
$hv2->show();
$hv3->show();
$hv4->show();

?>	