package it.corso.model;

public class Studente {
    String nome;
    String cognome;
    int matrciola;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatrciola() {
        return matrciola;
    }

    public void setMatrciola(int matrciola) {
        this.matrciola = matrciola;
    }

    public Studente(String nome, String cognome, int matrciola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matrciola = matrciola;
    }
}
