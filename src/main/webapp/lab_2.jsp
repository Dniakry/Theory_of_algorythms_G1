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
        <h1>Результат</h1>
        <p><%= request.getAttribute("result") %></p>
        <div>
            <form action="lab_2form.jsp">
                <input type="submit" value="Назад(ввести ще раз k)">
            </form>
        </div>
        <br>
        <p><a href="index.jsp">Home</a></p>
    </body>
</html>
