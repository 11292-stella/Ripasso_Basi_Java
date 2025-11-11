package org.example.Eccezioni.SimulazioneDueEccezioni;

public class Main {

    public static void main(String[] args) throws SaldoInsufficienteException {
        ContoBancario a = new ContoBancario(500.0);
        try {
            a.preleva(800.9);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());;
        }

        try {
            a.preleva(-20.23);
        } catch (ImportoNonValidoException b){
            System.out.println("Errore: " + b.getMessage());
        }



        System.out.println(a.preleva(50.50));
        System.out.println("Saldo finale: " + a.getSaldo());

    }
}
