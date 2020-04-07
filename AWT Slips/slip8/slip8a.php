<?php
$page_access=$_COOKIE['access'];
setCookie('access',++$page_access);
echo "$page_access";
?>