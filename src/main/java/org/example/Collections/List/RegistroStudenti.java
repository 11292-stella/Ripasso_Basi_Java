package org.example.Collections.List;

import java.util.List;

public class RegistroStudenti {

    private List<String> studenti;

    public RegistroStudenti(List<String> studenti) {
        this.studenti = studenti;
    }

    public List<String> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<String> studenti) {
        this.studenti = studenti;
    }

    public void aggiungiStudenti(String nome){
        studenti.add(nome);

    }

    public void rimuoviStudenti(String nome){
      studenti.remove(nome);

    }

    public void stampaStudenti(){
       System.out.println("Studenti nel registro:");
       for (String studente: studenti){
           System.out.println("- " + studente);
       }
    }
}
