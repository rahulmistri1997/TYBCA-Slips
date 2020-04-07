<?php
// Array with names
$a[] = "Ayan";
$a[] = "Bran";
$a[] = "Cherry";
$a[] = "Dev";
$a[] = "Esha";
$a[] = "Ford";
$a[] = "Geet";
$a[] = "Heena";
$a[] = "Ivan";
$a[] = "Jhon";
$a[] = "King";
$a[] = "Lord";
$a[] = "Nita";
$a[] = "Oman";
$a[] = "Preet";
$a[] = "Ash";
$a[] = "Rahul";
$a[] = "Scott";
$a[] = "Ram";
$a[] = "Evan";
$a[] = "Rishi";
$a[] = "Shona";
$a[] = "Teena";
$a[] = "Tiger";
$a[] = "Veeru";
$a[] = "Jems";
$a[] = "Ervin";
$a[] = "Jiya";
$a[] = "Wow";
$a[] = "Vivan";

$q = $_REQUEST["q"];

$hint = "";


if ($q !== "") {
    $q = strtolower($q);
    $len=strlen($q);
    foreach($a as $name) {
        if (stristr($q, substr($name, 0, $len))) {
            if ($hint === "") {
                $hint = $name;
            } else {
                $hint .= ", $name";
            }
        }
    }
}

 
echo $hint === "" ? "no suggestion" : $hint;
?>