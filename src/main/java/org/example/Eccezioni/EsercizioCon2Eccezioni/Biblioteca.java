package org.example.Eccezioni.EsercizioCon2Eccezioni;

import java.util.List;

public class Biblioteca {

    private List<String> libri;

    public Biblioteca(List<String> libri) {
        this.libri = libri;
    }

    public List<String> getLibri() {
        return libri;
    }

    public void setLibri(List<String> libri) {
        this.libri = libri;
    }

    public String prestaLibro(String titolo) throws LibroNonDisponibileException {
        if(titolo == null || titolo.isBlank()) {
            throw new TitoloNonValidoException("Titolo non valido");
        }

        if (!libri.contains(titolo)){
            throw new LibroNonDisponibileException("Libro non disponibile");
        }
        return titolo;
    }
}
