
<%@page import="knu.fit.ist.ta.Lab6_7.BinaryTreePrinter"%>
<%@page import="knu.fit.ist.ta.Lab6_7.BinaryTree"%>
<%@page import="knu.fit.ist.ta.Lab6_7.Lab6_7_1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 6-7</title>
    </head>
    <body>
        <a href="index.jsp">Back to landing page</a>
        <%! Lab6_7_1 lab6_7_1 = new Lab6_7_1(2311);%>
        <p>Number 2311 in octal: <%= lab6_7_1.Calculate()%></p>
        <%! BinaryTree tree = new BinaryTree();%>
        <%
            tree.add(6);
            tree.add(3);
            tree.add(10);
            tree.add(5);
            tree.add(2);
            tree.add(7);
            tree.add(8);
            tree.add(15);
        %>
        <pre>
        <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
        <%tree.mirrorTree(tree.getRoot()); %>
        <pre>
        <p>Result:<br> <%= BinaryTreePrinter.printNode(tree.getRoot())%></p>
        </pre>
    </body>
</html>
