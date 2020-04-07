<html>
  <head><title>slip16</title>
      <script language = "javascript">
      var xmlhttp = new XMLHttpRequest();
      function f2()
      {
          document.getElementById("t1").value = "";
      }
       function fun1()
       {
         var str = document.getElementById("t1").value;
         
         if(str == "")
         {
            document.getElementById("d1").innerHTML = "Select the element";
            return;
         }
        
         xmlhttp.onreadystatechange = function()
          {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
            {
              document.getElementById("d1").innerHTML = xmlhttp.responseText;
            }
            else
            {
                document.getElementById("d1").innerHTML = "not ready or status is not 200";
            }
      };
      xmlhttp.open("GET", "slip16.php?s="+str, true);
	
        xmlhttp.send();
   }
      </script>
  </head>
   <body onLoad = "f2()">
     <form name="f1" method="get">
        Select book name to get book details:
       <select id="t1" onChange="fun1()">          
        <?php                       
	   $xml=simplexml_load_file("book.xml") or die("Error: Cannot create object");
	   foreach($xml->children() as $cr) 
	   {     
	      echo "<option value='$cr->title'> $cr->title </option>";  
	   } 
        ?>
         </select>
     
<div id = "d1" style="font-size: 15"> </div>
 </form>
   </body>
</html>