<%-- 
    Document   : home
    Created on : Dec 8, 2018, 9:37:23 PM
    Author     : cnastase
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello, ${nume}!</h1>

        <form method="post">
            <input type ="text" name="nume" />
            <input type ="submit" value="Apasa" />
        </form>
    </body>
</html>
