<?php
    session_start();
    $_SESSION['hits']++;
?>

<html>
    <head>
        <title>Simple page hit counter</title>
    </head>
    <body>
        <p>You have visited this page <?php print $_SESSION['hits'] ?> times.</p>
    </body>
</html>