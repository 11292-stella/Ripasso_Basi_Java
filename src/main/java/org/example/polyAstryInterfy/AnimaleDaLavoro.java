package org.example.polyAstryInterfy;

public abstract class AnimaleDaLavoro {

    private String nome;
    private String peso;

    public AnimaleDaLavoro(String nome, String peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public abstract  String lavora();
}
