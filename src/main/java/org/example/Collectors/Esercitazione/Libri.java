package org.example.Collectors.Esercitazione;

public class Libri {
    private String titolo;
    private String autore;
    private String genere;
    private int copieVendute;

    public Libri(String titolo, String autore, String genere, int copieVendute) {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.copieVendute = copieVendute;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getCopieVendute() {
        return copieVendute;
    }

    public void setCopieVendute(int copieVendute) {
        this.copieVendute = copieVendute;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", copieVendute=" + copieVendute +
                '}';
    }
}
