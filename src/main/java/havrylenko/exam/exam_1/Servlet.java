/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package havrylenko.exam.exam_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            
        throws ServletException, IOException {
        
        String x = request.getParameter("x");
        
        double param = Double.parseDouble(x);
        double result = Calculate.Calculate((float) param);
        
        request.setAttribute("result", result);
        request.getRequestDispatcher("Exam.jsp").forward(request, response);
    }
}
