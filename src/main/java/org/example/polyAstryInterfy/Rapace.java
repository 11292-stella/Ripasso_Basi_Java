package org.example.polyAstryInterfy;

public class Rapace extends AnimaleDaLavoro implements Trainabile,Nutritivo{
    public Rapace(String nome, String peso) {
        super(nome, peso);
    }

    @Override
    public String lavora() {
        return "Si spaccia per medico ma gracchia!";
    }

    @Override
    public String nutri() {
        return "Si mangia i clienti del padre ";
    }

    @Override
    public String allena() {
        return "Pensa di farlo camminando!";
    }
}
