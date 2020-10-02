<%-- 
    Document   : editnote
    Created on : Oct 1, 2020, 6:10:51 PM
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
        <h1>Simple Note keeper</h1><br>
        <h2>Edit Note</h2>
        
        <form action="" method="POST">
            Title: <input type="text" name="title" value="${note.title}" /><br>
            Contents: <textarea name="message">${note.message}</textarea><br>
            
            <input type="submit" value="Save">            
        </form>              
    </body>
</html>
