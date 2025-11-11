package org.example.animali;

public class Animale {

    private String nome;
    private String specie;
    private SuonoAnimale suono;

    public Animale(String nome, String specie, SuonoAnimale suono) {
        this.nome = nome;
        this.specie = specie;
        this.suono = suono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public SuonoAnimale getSuono() {
        return suono;
    }

    public void setSuono(SuonoAnimale suono) {
        this.suono = suono;
    }

    //Creo un metodo
    public String descrizioneConSuono() {
        return nome + " è un " + specie + " e " + suono.getPrimosuono();
    }
}
