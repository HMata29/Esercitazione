package it.corso.esercitazione2112;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="servletLogin", value = "/servletLogin")
public class ServletLogin extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException {
        String file = "loggato.jsp";
        final String personalUtente= "Hedrick";
        final String personalPassword = "1234";
        String risultato;
        String nomeUtente = request.getParameter("utente");
        String nomePassword = request.getParameter("password");
        if(nomeUtente.equals(personalUtente) && nomePassword.equals(personalPassword)){
            RequestDispatcher view = request.getRequestDispatcher(file);
        }
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        try {
            view.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
        String file = "loggato.jsp";
        final String personalUtente= "Hedrick";
        final String personalPassword = "1234";
        String risultato;
        String nomeUtente = request.getParameter("utente");
        String nomePassword = request.getParameter("password");
        if(nomeUtente.equals(personalUtente) && nomePassword.equals(personalPassword)){
            RequestDispatcher view = request.getRequestDispatcher(file);
        }
        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        try {
            view.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }
}
