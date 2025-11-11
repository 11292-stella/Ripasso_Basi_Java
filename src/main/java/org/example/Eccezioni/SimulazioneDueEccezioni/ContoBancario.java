package org.example.Eccezioni.SimulazioneDueEccezioni;

import java.lang.RuntimeException;

public class ContoBancario {

    private Double saldo;

    public ContoBancario(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

public Double preleva(Double importo) throws SaldoInsufficienteException {

        if(importo < 0) {
            throw new ImportoNonValidoException("Importo negativo non ammesso");
        }
        if(importo > saldo){
            throw new SaldoInsufficienteException("Saldo insufficiente");
        }
        saldo -= importo;
        return saldo;

}
}
