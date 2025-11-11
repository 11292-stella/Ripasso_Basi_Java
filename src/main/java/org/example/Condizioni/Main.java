package org.example.Condizioni;

public class Main {
    public static void main(String[] args) {


        int voto = 28;

        if (voto >= 30) {
            System.out.println("Hai preso il massimo!");
        } else if (voto >= 18) {
            System.out.println("Esame superato.");
        } else {
            System.out.println("Esame non superato.");
        }

        /// 2. Cicli: for, while

        for (int i = 0; i < 5; i++) {
            System.out.println("Ripasso numero: " + i);
        }

        System.out.println("------------------------------------------");

        int i = 0;
        while (i < 5) {
            System.out.println("Ancora ripasso: " + i);
            i++;
        }



    }
}
