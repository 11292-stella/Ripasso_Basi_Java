package org.example.interfacceEastrazione;

public  abstract class Macchina {

    private String modello;
    private int anno;

    public Macchina(String modello, int anno) {
        this.modello = modello;
        this.anno = anno;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public abstract String avvia();
}
