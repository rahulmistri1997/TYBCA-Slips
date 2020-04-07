<?php
$typ=$_POST['s'];
$v=$_POST['vnm'];
$cm=$_POST['cmp'];
$cl=$_POST['clr'];
$a=$_POST['avg'];

echo "<h3> $typ $v $cm $cl $a </h3> ";

$doc=new DOMDocument('1.0','utf-8');
$doc->load("slip30b.xml");
$root=$doc->firstChild;

	 $subchild=$doc->createElement('Type');
	$subchild->setAttribute('t',$typ);

$subelem1=$doc->createElement('VehicleName',"$v");
$subelem2=$doc->createElement('Company',"$cm");
$subelem3=$doc->createElement('Color',"$cl");
$subelem4=$doc->createElement('Average',"$a");

$doc->appendChild($root);
$root->appendChild($subchild);
$subchild->appendChild($subelem1);
$subchild->appendChild($subelem2);
$subchild->appendChild($subelem3);
$subchild->appendChild($subelem4);
$doc->save("slip30b.xml");
echo "<br> saved in slip30b.xml";
?>