
<html>
    <body>
      <?php
           $t1 = 0;
           $t2 = 0;
           $t3 = 0;
           $total = 0;
           session_start();
           if($_SERVER['REQUEST_METHOD'] == 'POST')
           {
              $t1 = $_POST["t1"];           
              $t2 = $_POST["t2"];           
              $t3 = $_POST["t3"];           
           
              $total  = 40 * $t1 + 120 * $t2 + 80 * $t3;
              $_SESSION['FirstPageTotal'] = $total;
           }   
           
      ?>
        <form action="Slip11_1.php" method="post">
             <h2> Chocolates </h2>
             <table>
                 <tr>                   
                   <td> Cadbury Dairy Milk </td>
                   <th> Price : Rs.40 </th>
                   <td> Qty : <input style="width:40" type="text" name = "t1" value="<?= $t1 ?>"></td> 
                   <td><label>:: <?= 40 * $t1 ?></label> </td>
                 </tr>
                 <tr>		     
		     <td> Cadbury Dairy Milk Fruit And Nut</td>
		     <th> Price : Rs.120 </th>
		     <td> Qty : <input style="width:40" type="text" name = "t2" value="<?= $t2 ?>"></td> 
		     <td><label>:: <?= 120 * $t2 ?></label> </td>
                 </tr>
                 <tr>		     
		     <td> Cadbury Dairy Milk Caramel</td>
		     <th> Price : Rs.80 </th>
		     <td> Qty : <input  style="width:40" type="text" name = "t3" value="<?= $t3 ?>"></td> 
		     <td><label>:: <?= 80 * $t3 ?></label> </td>
                 </tr>
                 <tr>                      
                      <td><input type="submit" value = "Evaluate Total"></td>                      
                      <td> </td>
                      <td align = "Right" colspan=2><h3> Rs. <?=$total ?></h3></td>                 
                 </tr>
             </table>               
             <h3>
             <a href = "Slip11_2.php"> Visit Page For More Shopping </a>
             <br>
             <a href = "GenerateBill.php"> Visit To Generate Total Bill </a>
	                  
             </h3>
        </form>
    </body>
</html>