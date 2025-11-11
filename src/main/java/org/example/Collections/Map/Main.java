package org.example.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Coppie chiave-valore (key → value)

        Map<String,Integer> inventario = new HashMap<>();
        inventario.put("I Viaggi di Topo", 567768686);
        inventario.put("Chi ha spostato il mio formaggio!",677477478);
        inventario.put("Topo Return",73636352);
        inventario.put("Andrò via",1);

        Libreria libreria = new Libreria(inventario);

        libreria.stampaInventario();

        libreria.prestaLibro("Andrò via");
        libreria.prestaLibro("Andrò via");
        libreria.prestaLibro("Andrò via");

        libreria.stampaInventario();

    }
}
