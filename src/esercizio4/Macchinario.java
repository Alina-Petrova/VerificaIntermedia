/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author utente
 */
public abstract class Macchinario implements Riparabile{
    public static enum Marca {HONDA, EINHELL, BENASSI, TACKLIFE, GARDENITALIA};
    static int  index=0;
    private final Marca marca;
    private int idUnic;
    private int numOrdineLavorazione;
    private float costoTotRip=0;
    private final HashMap<Riparazione,Integer> elencoRiparazioni = new HashMap<Riparazione,Integer>();

    public Macchinario(Marca marca) {
        this.marca = marca;
        idUnic = ++index;
    }

    public int getIdUnic() {
        return idUnic;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public float getCostoTotRip() {
        return costoTotRip;
    }
    
    @Override
    public void setNumOrdineLavorazione(int numOrdineLavorazione) {
        this.numOrdineLavorazione = numOrdineLavorazione;
    }

    @Override
    public void addRip(Riparazione r) {
        elencoRiparazioni.put(r,numOrdineLavorazione);
        costoTotRip += r.getCostoRiparazione();
    }
  
    @Override
    public int getNumOrdineLavorazione() {
        return numOrdineLavorazione;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "Macchinario targa " + idUnic + " di marca " + marca + ", ordine lavorazione "+ numOrdineLavorazione+"\n";
        if(elencoRiparazioni.size()>0) {
            ris += "Tutte le riparazioni:\n";
            for(Riparazione r : elencoRiparazioni.keySet())
                ris += r.toString() + " ordine lavorazione " + elencoRiparazioni.get(r) + "\n";
        }  
        ris += "Costo totale delle riparazioni= "+costoTotRip+"\n";
        return ris;
    }
    

}
