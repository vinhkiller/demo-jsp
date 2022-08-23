package com.example.jsp_servelet.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("login/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username").trim();
        String password = request.getParameter("password").trim();
        if (username.equals("system") && password.equals("java")) {
            session.setAttribute("username", username);
            request.getRequestDispatcher("admin/dashboard/index.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Wrong username / password");
            request.getRequestDispatcher("login/login.jsp").forward(request, response);
        }
    }

}