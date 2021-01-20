/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

import java.util.HashMap;


/**
 *
 * @author utente
 */
public class Riparazione {
    public static enum nomeRip {CAMBIO_OLIO,CAMBIO_RUOTA,RIPARAZIONE_CIRCUITO_ELETTRICO,RIPARAZIONE_PARTI_MECCANICHE};
    
    //public HashMap<nomeRip,Integer> elencoRiparazioni = new HashMap<nomeRip,Integer>();
    
    private final nomeRip nomeRiparazione;
    private float costoRiparazione;

    public Riparazione(nomeRip nomeRiparazione, float costoRiparazione) {
        this.nomeRiparazione = nomeRiparazione;
        this.costoRiparazione = costoRiparazione;
    }
    
    

    public nomeRip getNomeRiparazione() {
        return nomeRiparazione;
    }


    public float getCostoRiparazione() {
        return costoRiparazione;
    }

    public void setCostoRiparazione(float costoRiparazione) {
        this.costoRiparazione = costoRiparazione;
    }

    @Override
    public String toString() {
        return ""+nomeRiparazione + " di costo " + costoRiparazione;
    }
    
    
}
