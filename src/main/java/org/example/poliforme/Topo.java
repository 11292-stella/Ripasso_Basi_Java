package org.example.poliforme;

public class Topo extends Animali{
    public Topo(String nome, String razza) {
        super(nome, razza);
    }

    @Override
    public String parla() {
        return "Squiit Squiit Squiit!!";
    }
}
