package org.example.poliforme;

public class Cane extends Animali {
    public Cane(String nome, String razza) {
        super(nome, razza);
    }

    @Override
    public String parla() {
        return "Bau Bau Bau!!";
    }
}
