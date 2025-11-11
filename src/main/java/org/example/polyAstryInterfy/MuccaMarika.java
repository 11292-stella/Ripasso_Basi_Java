package org.example.polyAstryInterfy;

public class MuccaMarika extends AnimaleDaLavoro implements Nutritivo,Trainabile{
    public MuccaMarika(String nome, String peso) {
        super(nome, peso);
    }

    @Override
    public String lavora() {
        return "Finge di lavorare";
    }

    @Override
    public String nutri() {
        return "Lei Mangia Sempre!";
    }

    @Override
    public String allena() {
        return "Mantiene solo l'abbonamento in palestra";
    }
}
