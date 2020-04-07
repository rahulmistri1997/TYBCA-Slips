<?php
$doc=new DOMDocument('1.0','utf-8');
$doc->load("slip26b.xml");
echo"<h2>";
$root=$doc->getElementsByTagName('book');
foreach($root as $b)
{
$title=$b->getElementsByTagName('title');
echo $title->item(0)->nodeName."=".$title->item(0)->nodeValue." , ";
}
$xml=simplexml_load_file("slip26b.xml") or die("Error:Cannot create object");

echo "<br><h2>";
echo "<table border=2><tr><th>Category</th><th>Title</th><th>Author</th><th>Year</th><th>Price</th></tr>";
foreach($xml->children() as $book)
{
echo "<tr>";
echo "<td>".$book['category']."</td>";
echo "<td>$book->title  $book->title['lang']</td>";
echo "<td> $book->author</td>";
echo"<td>$book->year</td>";
echo "<td> $book->price</td>";
echo "</tr>";
}
echo "</table>";
$doc->save("Slip26b.doc");
?>
