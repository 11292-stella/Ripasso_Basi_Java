package org.example.animali;

public abstract class  Suoni {

    private String primosuono;
    private String secondosuono;
    private String terzosuono;

    public Suoni(String primosuono, String secondosuono, String terzosuono) {
        this.primosuono = primosuono;
        this.secondosuono = secondosuono;
        this.terzosuono = terzosuono;
    }

    public String getPrimosuono() {
        return primosuono;
    }

    public void setPrimosuono(String primosuono) {
        this.primosuono = primosuono;
    }

    public String getSecondosuono() {
        return secondosuono;
    }

    public void setSecondosuono(String secondosuono) {
        this.secondosuono = secondosuono;
    }

    public String getTerzosuono() {
        return terzosuono;
    }

    public void setTerzosuono(String terzosuono) {
        this.terzosuono = terzosuono;
    }

    public String primo (){
        return "questa specie fa: " + primosuono;
    }

    public String secondo (){
        return "questa specie fa: " + secondosuono;
    }

    public String terzo  (){
        return "questa specie fa: " + terzosuono;
    }
}
