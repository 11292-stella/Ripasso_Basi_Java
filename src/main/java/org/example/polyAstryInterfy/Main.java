package org.example.polyAstryInterfy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AnimaleDaLavoro> a=new ArrayList<>();
        a.add(new Rapace("Pazzo n2","Infinto"));
        a.add(new MuccaMarika("Marikozzo Il Bacarozzo", "Illegale"));

        for (AnimaleDaLavoro any : a) {
            System.out.println("Il: " + any.getNome() + " " + any.lavora());

            if (any instanceof Nutritivo) {
                System.out.println("Nutri: " + ((Nutritivo) any).nutri());
            }

            if (any instanceof Trainabile) {
                System.out.println("Allena: " + ((Trainabile) any).allena());
            }

            System.out.println("-----");
        }
    }
}
