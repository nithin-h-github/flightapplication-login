<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>
<h2>Login:</h2>
<pre>
<form action="login" method="post">
Username:<input type="text" name="email"/>
Password:<input type="text" name="password"/>
<input type="submit" value="login"/> 
${msg}
</pre>
</form>
</body>
</html>