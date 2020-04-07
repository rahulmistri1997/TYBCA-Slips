<?php
$xml=simplexml_load_file("book.xml") or die("Error:Cannot Create object");
echo "<br><h2>";
foreach($xml->children() as $books)
{
echo "Category:".$books['category']." ";
echo $books->title."---lang is:".$books->title['lang']."<br>";
echo $books->author.",";
echo $books->year.",";
echo $books->price."<br>";
}
?>