/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utente
 */
public abstract class Macchinario {
    public static enum Marca {HONDA, EINHELL, BENASSI, TACKLIFE, GARDENITALIA};
    static int  index=0;
    private final Marca marca;
    private int idUnic;
    private int numOrdineLavorazione;
    private float costoTotRip=0;
    private List<Riparazione> elencoRiparazioni = new ArrayList<>();

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

    public void setNumOrdineLavorazione(int numOrdineLavorazione) {
        this.numOrdineLavorazione = numOrdineLavorazione;
    }

    public void addRip(Riparazione r) {
        elencoRiparazioni.add(r);
        costoTotRip += r.getCostoRiparazione();
    }
    
    public int getNumOrdineLavorazione() {
        return numOrdineLavorazione;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "Macchinario targa " + idUnic + " di marca " + marca + ", ordine lavorazione "+ numOrdineLavorazione+"\n";
        if(elencoRiparazioni.size()>0) {
            ris += "Tutte le riparazioni:\n";
            for(Riparazione r : elencoRiparazioni)
                ris += r.toString() + "\n";
        }  
        ris += "Costo totale delle riparazioni= "+costoTotRip+"\n";
        return ris;
    }
    

}
