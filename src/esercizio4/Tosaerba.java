/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

/**
 *
 * @author utente
 */
public class Tosaerba extends Macchinario{
    private final int numRuote;

    public Tosaerba(Marca marca, int numRuote) {
        super(marca);
        this.numRuote = numRuote;
    }

    public int getNumRuote() {
        return numRuote;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "Tosaerba a "+ numRuote+" ruote. "+super.toString();
        return ris;
    }
    
    
}
