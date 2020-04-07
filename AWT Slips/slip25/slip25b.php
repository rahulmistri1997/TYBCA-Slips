<?php
$xml=simplexml_load_file("slip25b.xml") or die("Error:Cannot create object");
echo"<br><h2>";
foreach($xml->children() as $cat)
{
echo "<br>Category:".$cat->getName()." ";
echo "<br><table border=2><tr><th>Year</th><th>Title</th><th>Author</th></tr>";

foreach($cat->children() as $book)
{
echo "<tr>";
echo "<td> $book->Book_PubYear</td>";
echo "<td> $book->Book_Title</td>";
echo "<td> $book->Book_Author</td>";
echo "<tr>";
}
echo "</table>";
}
?>