<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 6:10:36 PM
    Author     : 820203
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Notes</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <h2>View Note</h2><br>
        
        <form method="post" action="noteKeeper">
            Title: <input type="text" name="title" value="${title}"><br>
            Contents: <input type="text" name="message" value="${message}"><br>
        </form>
            
        <a href="note?edit"> 
    </body>
</html>
