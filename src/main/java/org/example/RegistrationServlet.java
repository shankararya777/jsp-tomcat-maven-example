package org.example;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet as defined in web.xml
 */
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() ||
                password.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("/Register_1.jsp");
            req.include(request, response);
        } else {
            RequestDispatcher req = request.getRequestDispatcher("/Register_2.jsp");
            req.forward(request, response);
        }
    }
}
