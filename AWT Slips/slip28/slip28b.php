<?php
$xml=simplexml_load_file("slip28b.xml") or die("Error:Cannot create object");
echo "<br><h2>";
foreach($xml->children() as $x)
{
if($x->runs>1000 && $x->wickets>50)
{
echo $x->player.",";
echo $x->runs.",";
echo $x->wickets.",";
echo $x->noofnotout."</h2><br>";

}
}
?>