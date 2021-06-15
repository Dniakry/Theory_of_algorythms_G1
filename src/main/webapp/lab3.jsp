<%-- 
    Document   : lab_3
    Created on : 3 июн. 2021 г., 21:46:37
    Author     : Юра
--%>

<%@page import="knu.fit.ist.ta.laba_3.Lab3"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 3</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <h1>Lab 3</h1>
        <%! Lab3 lab3 = new Lab3(10);%>
        <% lab3.InitArray(); %>
        <p>Array: <%= lab3.DisplayArray() %></p>
        <p>Maximum sum of digits: <%= lab3.GetMaximumSum() %></p>
    </body>
</html>
