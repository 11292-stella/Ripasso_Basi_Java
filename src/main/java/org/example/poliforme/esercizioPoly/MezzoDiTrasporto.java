package org.example.poliforme.esercizioPoly;

public abstract class MezzoDiTrasporto {
    private String marca;
    private String modella;

    public MezzoDiTrasporto(String marca, String modella) {
        this.marca = marca;
        this.modella = modella;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModella() {
        return modella;
    }

    public void setModella(String modella) {
        this.modella = modella;
    }

    public abstract String muoviti();
}
