package org.example.polyAstryInterfy.Arrreee;


public abstract class Veicolo {

    private String marca;
    private String anno;

    public Veicolo(String marca, String anno) {
        this.marca = marca;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public abstract String avviaMotore();
}
