<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
    body { font-family: Arial, sans-serif; }
    .error { color: red; }
</style>
</head>
<body>
    <h2>Login Form</h2>
    <form action="/log" method="post">
        Email: <input type="text" name="email1" /><br/><br/>
        Password: <input type="password" name="password1" /><br/><br/>
        <input type="submit" value="Login" />
    </form>
    <div class="error">
        <%-- Display error message if any --%>
        <%= request.getAttribute("errorMessage") != null ? request.getAttribute("errorMessage") : "" %>
    </div>
</body>
</html>