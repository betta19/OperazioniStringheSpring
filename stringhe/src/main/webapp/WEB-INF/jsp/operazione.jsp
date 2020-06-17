<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="contaParole" method="post">
Scegli l'operazione che vuoi fare: <br>
<input type="submit" value="Conteggio parole">
<input type="hidden"  name="testo" value= "${testo}"/> 
</form>

<form action="contaVocali" method="post">
<input type="submit" value="Conteggio vocali">
<input type="hidden"  name="testo" value= "${testo}"/> 
</form>

<form action="contaConsonanti" method="post">
<input type="submit" value="Conteggio consonanti">
<input type="hidden"  name="testo" value= "${testo}"/> 
</form>
</body>
</html>