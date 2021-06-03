<%-- 
    Document   : lan_2
    Created on : 23 апр. 2021 г., 13:22:04
    Author     : Юра
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laba2</title>
    </head>
    <body>
        <h3>Laba2</h3>
        <br>
        <p><%=request.getAttribute("result")%></p>
        
        
        <div>
            <form action="lab_2form.jsp">
                <input type="submit" value="вернутся(ввести ще раз x)">
            </form>
        </div>
        
        <a href="index.jsp">Home</a>
    </body>
</html>
