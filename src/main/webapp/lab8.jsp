
<%@page import="knu.fit.ist.ta.Lab8.AlgorithmDetails"%>
<%@page import="knu.fit.ist.ta.Lab8.Algorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <h2 class="text-left"><b>Постановка задачі:</b> відсортувати масив цілих чисел</h2>
        <p><b>Вихідні дані:</b><br>Кількість елементів: 35000</p>
        <%! Algorithms algorithms = new Algorithms(35000);%>
        <hr>
        <% AlgorithmDetails heapSortDetails = algorithms.HeapSort(); %>
        <p><b>Назва алгоритму: </b>Heap Sort</p>
        <p><b>Час роботи:</b>  <%= heapSortDetails.getTime() %>ms</p>
        <p><b>Кількість порівнянь </b><%= heapSortDetails.getComparisons() %></p>
        <p><b>Кількість перестановок </b><%= heapSortDetails.getSubstitutions() %></p>
        <p><b>Складність(Big-O): nlog(n)</b></p>
        <hr>
        <% AlgorithmDetails mergeSortDetails = algorithms.MergeSort(); %>
        <p><b>Назва алгоритму: </b>Merge Sort</p>
        <p><b>Час роботи:</b>  <%= mergeSortDetails.getTime() %>ms</p>
        <p><b>Кількість порівнянь </b><%= mergeSortDetails.getComparisons() %></p>
        <p><b>Кількість перестановок </b><%= mergeSortDetails.getSubstitutions() %></p>
        <p><b>Складність(Big-O): nlog(n)</b></p>
        <hr>
        <% AlgorithmDetails shellSortDetails = algorithms.ShellSort(); %>
        <p><b>Назва алгоритму: </b>Shell Sort</p>
        <p><b>Час роботи:</b>  <%= shellSortDetails.getTime() %>ms</p>
        <p><b>Кількість порівнянь </b><%= shellSortDetails.getComparisons() %></p>
        <p><b>Кількість перестановок </b><%= shellSortDetails.getSubstitutions() %></p>
        <p><b>Складність(Big-O): n(log(n))^2</b></p>
    </body>
</html>
