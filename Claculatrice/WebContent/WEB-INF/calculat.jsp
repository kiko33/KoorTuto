<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>
 <p>je suis une claculatrice</p>
 
 <form method="post" action="calculer">
 
Operation: <input type="text" name="val1" autofocus /><br>
<input type="text" name="val2" /><br>
<input name = "btnAdd" type = "Button"  value="+">
<button name="Add" id="Add"  value="Addition" >Addition</button>
<input name = "validate" type="submit" value="Valider" >
</form>


 
</body>
</html>