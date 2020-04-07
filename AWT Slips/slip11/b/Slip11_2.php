
<html>
    <body>
<?php
           $t1 = 0;
           $t2 = 0;
           $t3 = 0;
           $t4 = 0;
           $total = 0;
           session_start();
           if($_SERVER['REQUEST_METHOD'] == 'POST')
           {
              $t1 = $_POST["t1"];           
              $t2 = $_POST["t2"];           
              $t3 = $_POST["t3"];           
              $t4 = $_POST['t4'];
           
              $total  = 30 * $t1 + 100 * $t2 + 5 * $t3 + 50 * $t4;
              $_SESSION['SecondPageTotal'] = $total;
           }   
           
      ?>
        <form action="Slip11_2.php" method="post">
             <h2> School Accessories</h2>
             <table>
                 <tr>                   
                   <td> Lead Pensil  </td>
                   <th> Price : Rs.30 </th>
                   <td> Qty : <input style="width:40" type="text" name = "t1" value="<?= $t1 ?>"></td> 
                   <td><label>:: <?= 30 * $t1 ?></label> </td>
                 </tr>
                 <tr>		     
		     <td>Crayons </td>
		     <th> Price : Rs.100 </th>
		     <td> Qty : <input style="width:40" type="text" name = "t2" value="<?= $t2 ?>"></td> 
		     <td><label>:: <?= 100 * $t2 ?></label> </td>
                 </tr>
                 <tr>		     
		     <td> Eraser</td>
		     <th> Price : Rs.5 </th>
		     <td> Qty : <input  style="width:40" type="text" name = "t3" value="<?= $t3 ?>"></td> 
		     <td><label>:: <?= 5 * $t3 ?></label> </td>
                 </tr>
                 <tr>		     
		     <td> Glue Stick</td>
		     <th> Price : Rs.50 </th>
		     <td> Qty : <input  style="width:40" type="text" name = "t4" value="<?= $t4 ?>"></td> 
		     <td><label>:: <?= 50 * $t4 ?></label> </td>
                 </tr>
                 <tr>                      
                      <td><input type="submit" value = "Evaluate Total"></td>                      
                      <td> </td>
                      <td align = "Right" colspan=2><h3> Rs. <?= $total ?></h3></td>                 
                 </tr>
             </table>               
             <h3>
             <a href = "Slip11_3.php"> Visit Link For More Shopping</a><br>
             <a href = "GenerateBill.php"> Visit To Generate Total Bill </a>
             <br>
             <a href = "Slip11_1.php"> Back </a>
             </h3>
        </form>
    </body>
</html>