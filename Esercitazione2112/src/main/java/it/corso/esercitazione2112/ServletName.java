package it.corso.esercitazione2112;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="servletName", value = "/servletName")
public class ServletName  extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String file = "servletName.jsp";
        String name = request.getParameter("nome");
        request.setAttribute("name", name);
        RequestDispatcher view = request.getRequestDispatcher(file);
        try {
            view.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }

}
