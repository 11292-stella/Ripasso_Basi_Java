package org.example.CosèUnOggettoUnaClasseUnMetodo.PrimaCreazioneClasseConCostruttoEMetodi;

public class Animale {

    private String nome;
    private String specie;
    private SuonoAnimale suono;


    //Costruttore
    //Il «costruttore» è un metodo speciale che ha lo stesso nome della
    //classe in cui è contenuto, ma senza modificatore, permette di
    //inizializzare una istanza della classe.
    // Può avere nessuno o più parametri.

    // Se non scritto in modo esplicito dal programmatore Java
    //aggiunge automaticamente un costruttore detto di default

    public Animale(){}

    //Se invece selezioniamo entrambi gli attributi otterremo un
    //costruttore con parametri

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
