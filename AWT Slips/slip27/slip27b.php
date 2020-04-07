<?php
$ct=$_POST['s'];
$nm=$_POST['pnm'];
$r=$_POST['rn'];
$w=$_POST['wck'];

echo "<h3> $ct $n $r $w";
$doc=new DOMDocument('1.0','utf-8');
$doc->load("slip27b.xml");
$root=$doc->firstChild;
$subchild = $doc->createElement('Team');
       
      $subchild->setAttribute("country",  "$ct");
       
       
       
       $subelem1 = $doc->createElement('player' , "$nm");
          $subelem2 = $doc->createElement('runs' , "$r");
          $subelem3 = $doc->createElement('wicket' , "$w");
          $doc->appendChild($root);
          $root->appendChild($subchild);
          $subchild->appendChild($subelem1);
          $subchild->appendChild($subelem2);
          $subchild->appendChild($subelem3);
          $doc->save("Slip27b.xml");
           echo "Saved in Slip27b.xml" ;
      
?>