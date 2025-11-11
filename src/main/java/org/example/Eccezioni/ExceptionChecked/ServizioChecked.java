package org.example.Eccezioni.ExceptionChecked;

public class ServizioChecked {
    public void esegui(int valore) throws ErroreChecked{
        if(valore <0){
            throw new ErroreChecked("Valore negativo non ammesso");
        }
        System.out.println("Valore accettato: "+ valore);
    }
}
