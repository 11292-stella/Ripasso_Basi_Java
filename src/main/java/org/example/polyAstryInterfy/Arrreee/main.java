package org.example.polyAstryInterfy.Arrreee;

import org.example.polyAstryInterfy.AnimaleDaLavoro;
import org.example.polyAstryInterfy.Nutritivo;
import org.example.polyAstryInterfy.Trainabile;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Veicolo> b = new ArrayList<>();
        b.add(new AutoElettrica("Pandino","Vecchio è di Marika!"));
        b.add(new Drone("UFO","Nuovo"));

        for (Veicolo vey : b ){
            System.out.println("Il veiocolo: " + vey.getMarca() + " del: "  + vey.getAnno() + " " + vey.avviaMotore());

            if (vey instanceof Autonomo){
                System.out.println("Autonomo: "+ ((Autonomo) vey).guidaDaSolo());
            }

            if(vey instanceof Elettrico){
                System.out.println("Elettrico: "+((Elettrico)vey).ricarica());
            }

            System.out.println("----------");
        }









}}
