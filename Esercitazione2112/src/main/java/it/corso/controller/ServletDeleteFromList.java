package it.corso.controller;

import it.corso.DAO.UserDAO;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletDeleteFromList", value = "/ServletDeleteFromList")
public class ServletDeleteFromList extends HttpServlet {
    private UserDAO userDAO;
    public void init() {
        userDAO = new UserDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        try{
            userDAO.deleteUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("UserReadAll.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
