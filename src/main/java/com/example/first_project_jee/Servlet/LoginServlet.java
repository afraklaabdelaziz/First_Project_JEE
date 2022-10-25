package com.example.first_project_jee.Servlet;

import com.example.first_project_jee.Entities.User;
import com.example.first_project_jee.Services.Implimentation.UserServiceImplomentation;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    UserServiceImplomentation userService = new UserServiceImplomentation();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.getRequestDispatcher("/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        userService.login(email,password);
        List<User> users = userService.listUser();
        users.forEach(value -> {
            if (value.getEmail().equals(email) && value.getPassword().equals(password)){
                try {
                    request.getRequestDispatcher("/connect.jsp").forward(request,response);
                } catch (ServletException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
