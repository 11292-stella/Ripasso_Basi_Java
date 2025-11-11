package org.example.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Lista ordinata, può contenere duplicati

        RegistroStudenti a = new RegistroStudenti(new ArrayList<>(List.of("Barnaba")));
        RegistroStudenti b = new RegistroStudenti(new ArrayList<>(List.of("Bartolomeo")));
        RegistroStudenti c = new RegistroStudenti(new ArrayList<>(List.of("Gustavo")));

        a.aggiungiStudenti("Marika");
        b.rimuoviStudenti("Marika");
        c.stampaStudenti();
        a.stampaStudenti();
        b.stampaStudenti();

    }
}
