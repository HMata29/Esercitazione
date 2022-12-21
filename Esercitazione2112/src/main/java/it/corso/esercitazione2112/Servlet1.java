package it.corso.esercitazione2112;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Servlet1", value = "/servlet1")
public class Servlet1 extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String nome = "Hedrick Matamorosa";
        String file = "servlet1.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(file);
        request.setAttribute("nome",nome);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }
}
