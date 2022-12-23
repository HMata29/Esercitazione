package it.corso.controller;

import it.corso.DAO.UserDAO;
import it.corso.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletUpdateFromList", value = "/ServletUpdateFromList")

public class ServletUpdateFromList extends HttpServlet {

    private UserDAO userDAO;
    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("userUpdate-form.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userDAO.selectUser(id);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        int age = Integer.parseInt(request.getParameter("age"));

        response.sendRedirect("UserReadAll.jsp");
    }
}
