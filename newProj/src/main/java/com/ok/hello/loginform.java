package com.ok.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class loginform extends HttpServlet {
    private static final String VALID_EMAIL = "abc@gmail.com";
    private static final String VALID_PASSWORD = "1234";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String myemail = req.getParameter("email1");
        String password = req.getParameter("password1");

        // Basic validation
        if (myemail == null || myemail.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            out.print("<h3 style='color:red;'>Email and password cannot be empty!</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, resp);
            return;
        }

        // Check credentials
        if (VALID_EMAIL.equals(myemail) && VALID_PASSWORD.equals(password)) {
            RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            rd.forward(req, resp); // Use forward instead of include
        } else {
            out.print("<h3 style='color:red;'>Email or password is incorrect!</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, resp);
        }

        out.close(); // Close the PrintWriter
    }
}