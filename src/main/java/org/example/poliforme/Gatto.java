package org.example.poliforme;

public class Gatto extends Animali {
    public Gatto(String nome, String razza) {
        super(nome, razza);
    }

    @Override
    public String parla() {
        return "Miao Miao Miao!!";
    }
}
