package org.example.poliforme.esercizioPoly;

import java.util.ArrayList;

public class Main3 {

    public static void main(String[] args) {
        ArrayList<MezzoDiTrasporto> a = new ArrayList<>();
        a.add(new Auto("Panda","Pandino"));
        a.add(new Fetta("Leerdammer","Latteo"));


        for (MezzoDiTrasporto t : a){
            System.out.println("questa " + t.getMarca() + " modello: " + t.getModella() + " Si muove a: " + t.muoviti());
        }
    }
}
