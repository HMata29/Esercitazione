package it.corso.controller;

import it.corso.model.Studente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "studente", value = "/studente")
public class StudenteController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Studente s1 = new Studente("Pippo", "Baudo" ,1);
        Studente s2 = new Studente("Mario" ,  "Rossi" , 2);
        Studente s3 = new Studente("Piero" , "Pierino" ,3);
        String file = "studente.jsp";

       /* List <Studente> lista = new ArrayList<>(); ;
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);

        for(Studente s : lista){
            s.getNome();
            s.getCognome();
            s.getMatrciola();
        }*/

        String s1Nome = s1.getNome();
        String s1Cognome = s1.getCognome();
        int s1Matricola = s1.getMatrciola();
        String s2Nome = s2.getNome();
        String s2Cognome = s2.getCognome();
        int s2Matricola = s2.getMatrciola();
        String s3Nome = s3.getNome();
        String s3Cognome = s3.getCognome();
        int s3Matricola = s3.getMatrciola();

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(file);
        request.setAttribute("s1Nome",s1Nome);
        request.setAttribute("s1Cognome",s1Cognome);
        request.setAttribute("s1Matricola",s1Matricola);
        request.setAttribute("s2Nome",s2Nome);
        request.setAttribute("s2Cognome",s2Cognome);
        request.setAttribute("s2Matricola",s2Matricola);
        request.setAttribute("s3Nome",s3Nome);
        request.setAttribute("s3Cognome",s3Cognome);
        request.setAttribute("s3Matricola",s3Matricola);

        requestDispatcher.forward(request, response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{

    }
}
