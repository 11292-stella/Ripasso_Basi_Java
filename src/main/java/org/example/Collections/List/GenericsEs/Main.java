package org.example.Collections.List.GenericsEs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Studente a = new Studente("Marikozzo", "Il Bacarozzo", 2);
        Studente b = new Studente("Obeso","Gracchio",1);
        Studente c = new Studente("Sharonna","La mignotta",1);

        RegistroStudenti registroStudenti = new RegistroStudenti(
                new ArrayList<>(List.of(a, b, c))
        );

        registroStudenti.stampaStudenti();
        registroStudenti.rimuoviStudente(c);
        registroStudenti.stampaStudenti();

    }
}
