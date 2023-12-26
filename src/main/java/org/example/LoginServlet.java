package org.example;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class for LoginServlet as defined in web.xml
 */
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.isEmpty() || password.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("/Register_3.jsp");
            req.include(request, response);
        } else {
            RequestDispatcher req = request.getRequestDispatcher("/Register_4.jsp");
            req.forward(request, response);
        }
    }
}
