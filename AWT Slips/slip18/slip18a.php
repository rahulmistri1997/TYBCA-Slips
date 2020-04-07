<?php
$ct=$_POST['s'];
$t=$_POST['bnm'];
$p=$_POST['prc'];
echo  "<h2> $ct  $t  $p";

$doc =new DOMDocument('1.0','utf-8');
$doc->load("slip18a.xml");
$root=$doc->firstChild;

$subchild=$doc->createElement('book');
$subelem1=$doc->createElement('category',"$ct");
$subelem2=$doc->createElement('title',"$t");
$subelem3=$doc->createElement('price',"$p");
$doc->appendChild($root);
$root->appendChild($subchild);
$subchild->appendChild($subelem1);
$subchild->appendChild($subelem2);
$subchild->appendChild($subelem3);
$doc->save("slip18a.xml");
echo "Saved in slip18a.xml";
?>
