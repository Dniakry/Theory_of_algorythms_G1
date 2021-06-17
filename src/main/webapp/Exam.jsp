<%-- 
    Document   : index
    Created on : 16.06.2021, 19:12:58
    Author     : Admin
--%>

<%@page import="havrylenko.exam.exam_1.Formul"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam</title>
    </head>
    <body>
        <h1>  Havrylenko Yuriy IP-11  </h1>
        
        <a href="index.jsp">Повернутися на головну сторінку</a>
        <%! Formul fr = new Formul(85); %>
        <p>Початкові Аргументи:- _______________<%= fr.GetArgs()%>_______ </p>
        <p>Результат по формулі:________________<%= fr.Calculate() %>______</p>
      
        <form action="./formula" method="post" class="form-inline">
            <label for="x"><b>Наберіть число для перевірки:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/>
                <input class="btn btn-success" type="submit" value="РОзрахувати  "/>
            </div>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p>
        </form>
    </body>
</html>
