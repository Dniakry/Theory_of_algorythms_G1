<%-- 
    Document   : lab_1
    Created on : 15 апр. 2021 г., 21:36:53
    Author     : Юра
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laba_1</title>
    </head>
    <body>
        <h1>laba_1</h1>
        
        <%! MyFirstJavaClass fDD =  new MyFirstJavaClass(5);%>
        <%
           int x = fDD.getMyint();
          
           x += 3;
           x %= 3;
           
        %>
        
        <p>
            8mod3<%=x%>
        </p>
        
        <a href="index.jsp">Home</a>
        
    </body>
</html>