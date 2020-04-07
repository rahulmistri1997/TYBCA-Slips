<html>
  <body>
  <?php
       session_start();
       if(isset($_SESSION['FirstPageTotal']))
           $t1 = $_SESSION['FirstPageTotal'];
       else
           $t1 = 0;
       if(isset($_SESSION['SecondPageTotal']))    
           $t2 = $_SESSION['SecondPageTotal'];
       else
          $t2 = 0;
       if(isset($_SESSION['ThirdPageTotal']))
          $t3 = $_SESSION['ThirdPageTotal'];
       else
          $t3 = 0;
       
       
       
       $total = $t1 + $t2 + $t3;
   ?>
     <h3> First Page Total is  = <?= $t1 ?></h3>   
     <h3> Second Page Total is  = <?= $t2 ?></h3>  
     <h3> Third Page Total is  = <?= $t3 ?></h3>  
     <h2> Total is  = <?= $total ?></h2>   
   </body>
 </html> 
  
  