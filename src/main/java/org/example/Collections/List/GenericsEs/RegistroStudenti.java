package org.example.Collections.List.GenericsEs;

import java.util.List;

public class RegistroStudenti {

    private List<Studente> studenti;

    public RegistroStudenti(List<Studente> studenti) {
        this.studenti = studenti;
    }

    public List<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Studente> studenti) {
        this.studenti = studenti;
    }

    public void aggiungiStudente(Studente nome){
        studenti.add(nome);
    }

    public void rimuoviStudente(Studente nome){
        studenti.remove(nome);
    }

    public void stampaStudenti(){
        System.out.println("Registro Studenti: ");
        for(Studente studente : studenti ){
            System.out.println("- " + studente);
        }

    }


}
