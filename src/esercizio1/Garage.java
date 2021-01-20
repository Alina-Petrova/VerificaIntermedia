/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utente
 */
public class Garage {
    private final List<VeicoloMotore> parcheggio;
    private final int posti;

    public Garage(int posti) {
        this.posti = posti;
        parcheggio = new ArrayList<VeicoloMotore>(posti);
        inizializza();
    }
    
    private int postoLibero() {
        return parcheggio.indexOf(null);  
    } 
    private void inizializza() {
        for(int i=0; i<posti; i++)
            parcheggio.add(null);
    }

    public void immissioneVeicolo(VeicoloMotore veicolo) {
        if (postoLibero() == -1) {
            throw new GarageException("Il garage è pieno...");
        }
        parcheggio.set(postoLibero(), veicolo);
    }
    
    public VeicoloMotore estrazioneVeicolo(int index) {
        if (index >= this.posti || parcheggio.get(index) == null) {
            throw new GarageException("Il posto non esiste oppure è vuoto");
        }
        VeicoloMotore v = parcheggio.get(index);
        parcheggio.set(index, null);
        return v;           
    }
    
    public String situazioneGarage() {
        String ris = "";        
        for (int i=0; i< parcheggio.size(); i++) {
            if (parcheggio.get(i) != null) {
                ris+="--------------- POSTO " + i + "------------------";
                ris+=parcheggio.get(i)+"\n---------------------------------\n";
            }

        }
        return ris;
    }
}
