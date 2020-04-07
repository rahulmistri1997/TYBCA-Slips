<?php
$roll_no=$_GET['txtno'];

echo "Your Roll Number Is :$roll_no<br>";
$fac=substr($roll_no,0,2);
echo "$fac<br>";
if($fac==BS)
echo "Faculty is B.Sc<br>";
else if($fac==BC)
echo "Faculty is BCA<br>";
else if($fac==BA)
echo "Faculty is BA<br>";

$year=substr($roll_no,2,1);
if($year==1)
echo "Year is First Year<br>";
else if($year==2)
echo "Year is Second Year<br>";
else if($year==3)
echo "Year is Third Year<br>";

echo "Your Roll No. is".substr($roll_no,3)."<br>";

?>