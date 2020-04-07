<?php
$uid='root';
$pwd='';
$db='testdb';
$snm = $_GET['s'];
$con=mysqli_connect('localhost',$uid,$pwd,$db) or die("Wrong ");
 echo "Great work!!";
  $sql = "Select sno,sname,per from studm where sname = '$snm'";
    $r = mysqli_query($con, $sql);
    
    $n = mysqli_num_rows($r);
    
    echo "<table border = 2>";
    echo "<tr> <th> Sno </th> ";
    echo"<th> Sname </th>";
    echo "<th> Per </th></tr>";
    
    for($i = 0 ; $i < $n; $i++)
    {
         $row = mysqli_fetch_assoc($r);
         echo "<tr> <td> " . $row["sno"] . "</td>";
         echo "<td> " . $row["sname"] . "</td>";
         echo "<td> " . $row["per"] . "</td></tr>";
         
         
    }
    mysqli_close($con);
?>