<?php
                session_start();
                $nm=$_GET['n'];
                $ps=$_GET['p'];
                if($nm==$ps)
                {
                                echo "correct";
                }
                else if(isset($_SESSION['cnt']))
                                                {
                                                                $x=$_SESSION['cnt'];
                                                                $x=$x+1;
                                                                $_SESSION['cnt']=$x;
                                                                echo $_SESSION['cnt'];
                                                               
                                                                if($_SESSION['cnt']>=3)
                                                                $_SESSION['cnt']=1;
                                                }
                                                else
                                                {
                                                                $_SESSION['cnt']=1;
                                                                echo "1";
                                                }
?>