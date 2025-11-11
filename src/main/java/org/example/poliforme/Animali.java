package org.example.poliforme;

public abstract class Animali {
    private String nome;
    private String razza;

    public Animali(String nome, String razza) {
        this.nome = nome;
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public abstract String parla();
}
