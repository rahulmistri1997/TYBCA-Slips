<html>
<body>
<table border=2>
<tr>
<th>PHP SELF </th>
<th>Server name </th>
<th>Server software </th>
<th>HTTP HOST </th>
<th>SCRIPT NAME </th>
<th>SERVER PORT </th>
</tr>
<tr>
<td><?php echo $_SERVER['PHP_SELF'];?></td>
<td><?php echo $_SERVER['SERVER_NAME'];?></td>
<td><?php echo $_SERVER['SERVER_SOFTWARE'];?></td>
<td><?php echo $_SERVER['HTTP_HOST'];?></td>
<td><?php echo $_SERVER['SCRIPT_NAME'];?></td>
<td><?php echo $_SERVER['SERVER_PORT'];?></td>
</tr>
</table>
</body></html>

