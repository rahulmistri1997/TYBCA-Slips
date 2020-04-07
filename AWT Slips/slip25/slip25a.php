<?php
class student
{var $name="IVAN";}

class exam 
{var $mark=80;}

$s1=new exam;
if(is_object($s1))
{echo "is object<br>";

if($s1 instanceOf student)
{echo "is object of student class<br>";}

else
{echo "Exam class object";}
}
else{ echo "is not an object";}
?>