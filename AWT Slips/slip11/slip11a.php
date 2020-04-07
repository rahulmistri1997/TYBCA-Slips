<?php
$doc= new DOMDocument();
$doc->load("slip11a.xml");
$tracks=$doc->getElementsByTagName("track");
echo "<html><body><h3>";

foreach($tracks as $t)
{
$path =$t->getElementsByTagName("path");
$p=$path->item(0)->nodeValue;
$title=$t->getElementsByTagName("title");
$v=$title->item(0)->nodeValue;
echo "<br> Song-<a href='$p'>$p</a> $v";
}
echo "</h3></body></html>";
?>