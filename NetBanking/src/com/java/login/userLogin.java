package com.java.login;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class userLogin extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String uname = request.getParameter("userid");
        String pass = request.getParameter("userpass");
        System.out.println(uname+"  "+pass);
        
        if(Validate.checkCustomer(uname, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("CustomerHome.html");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("index.html");
           rs.include(request, response);
        }
    }  
}
