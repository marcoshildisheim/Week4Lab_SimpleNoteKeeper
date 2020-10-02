<%-- 
    Document   : viewnote
    Created on : Oct 1, 2020, 6:10:36 PM
    Author     : 820203
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Notes</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1><br>
        <h2>View Note</h2><br>
        <h3>Title: ${note.title}</h3>
        <h3>Content:</h3>
        <p>%{note.message}</p>
            
        <a href="note?edit">Edit</a> 
    </body>
</html>
