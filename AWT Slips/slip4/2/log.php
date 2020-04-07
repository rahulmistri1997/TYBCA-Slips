<?php
session_start();
#if(set_time_limit(20)) echo"Time Expired";
if(($_REQUEST['uname']=="admin")and($_REQUEST['pwd']=="admin"))
 
 {
  echo"<form method='post' action='display.php'>";
  echo"<b>Roll No:</b><input type='text' name='roll'<br><br>";
  echo"<b>Name:</b><input type='text' name='name'<br><br>";
  echo"<b>City:</b><input type='text' name='city'<br><br>";
  echo"<input type='submit' name='display'/></form>";
  
  
 }
 else
  echo "wrong information...<a href='log.html'>login.html</a>";


?>