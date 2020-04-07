<?php
       $unm = $_GET['u'];
       if(strlen($unm) == 0)
          echo "*Enter User Name";
       else if(strlen($unm) < 3)   
          echo "*User Name is too short";
       else
          echo "Valid User Name";
?>