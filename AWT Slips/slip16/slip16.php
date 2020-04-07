<?php
    $s = $_GET['s'];
    
$xml=simplexml_load_file("book.xml") or die("Error: Cannot create object");
echo "<br><h2>";
foreach($xml->children() as $books) { 
   if($books->title == $s)
   {
    echo "Category : " . $books['category'] . " , " ;
    echo $books->title . "  lang is : " . $books->title['lang'] . " , "; 
    echo $books->author . ", "; 
    echo $books->year . ", ";
    echo $books->price . "<br>"; 
    }
} 

?>