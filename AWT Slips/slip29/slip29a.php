<?php
$text="<?xml version='1.0' encoding='ISO-8859-1' ?>";
$text.="<Course>";
$snm=Array("Ivan","Scott","Tiger","King","Jhon");
$cls=Array("TYBCA","TYBCA","TYBCA","TYBCA","TYBCA");
$per=Array(70,75,68,88,80);
for($i=0;$i<5;$i++)
{
$text.="<ComputerScience>";
$text.="<StudentName>".$snm[$i]."</StudentName>";
$text.="<ClassName>".$cls[$i]."</ClassName>";
$text.="<Percentage>".$per[$i]."</Percentage>";
$text.="</ComputerScience>";
}
$text.="<Course>";
$fp=fopen("slip29a.xml","w");
$write=fwrite($fp,$text);
echo "<br><h2>File content saved in Slip29.xml</h2>"; 
?>