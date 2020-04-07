<?php
$uid='root';
$pwd='';
$db='testdb';
$bnm = $_GET['b'];
$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";
  $sql = "Select bno, bname, src, des from bus where bname = '$bnm'";
    $r = mysqli_query($con, $sql);
    
    $n = mysqli_num_rows($r);
    
    echo "<table border = 2>";
    echo "<tr> <th> Bno </th> <th> Name </th>";
    echo "<th> Source </th><th> Destination </th></tr>";
    
    for($i = 0 ; $i < $n; $i++)
    {
         $row = mysqli_fetch_assoc($r);
         echo "<tr> <td> " . $row["bno"] . "</td>";
         echo "<td> " . $row["bname"] . "</td>";
         echo "<td> " . $row["src"] . "</td>";
         echo "<td> " . $row["des"] . "</td></tr>";
         
    }
    mysqli_close($con);
?>