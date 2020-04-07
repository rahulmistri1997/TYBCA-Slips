<?php
$text="<?xml version='1.0' encoding='ISO-8859-1'?>";
$text.="<BookStore>";
$text.="<Books>";
$text.="<PHP>";
$text.="<title>Programming PHP</title>";
$text.="<publication>O'RELLY</publication>";
$text.="</PHP>";

$text.="<PHP>";
$text.="<title>Beginners PHP</title>";
$text.="<publication>WROX</publication>";
$text.="</PHP>";
$text.="</Books>";
$text.="</BookStore>";

$fp=fopen("slip23a.xml","w");
$write=fwrite($fp,$text);
echo "<br><h3>File content saved in Slip23.xml</h3>"; 
?>