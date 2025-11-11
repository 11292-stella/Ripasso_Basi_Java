package org.example.Collections.List.GenericsEs;

public class Studente {

    private String nome;
    private String cognome;
    private int voto;

    public Studente(String nome, String cognome, int voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto = voto;
    }

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

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }


    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", voto=" + voto +
                '}';
    }
}
