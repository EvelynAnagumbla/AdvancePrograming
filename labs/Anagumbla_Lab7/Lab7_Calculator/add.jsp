<%-- 
    Document   : add
    Created on : 22/05/2019, 12:23:47
    Author     : Cristina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <h1>ADDITION </h1>
    </head>
    <body <%="<h1>The sum is: "+(Integer.parseInt(request.getParameter("t1"))+Integer.parseInt(request.getParameter("t2")))+"</h1>"%>
        
       
    </body>
</html>
