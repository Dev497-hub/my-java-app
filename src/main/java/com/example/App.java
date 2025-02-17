package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class App extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Write response message
        response.getWriter().println("<h1>Hello, Jenkins and Maven!</h1>");
    }
}
