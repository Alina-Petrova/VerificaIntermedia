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
public class Officina {
    private static int numLavorazione=0;
    private final int numPosti;
    private final List<Macchinario> officina;
    private List<Macchinario> coda = new ArrayList<>();

    public Officina(int numPosti) {
        this.numPosti = numPosti;
        officina = new ArrayList<>(numPosti);
        init();
    }
    
    public void enter(Macchinario m, String nomeRiparazione, float costoLavorazione) {
        if(postoLibero() == -1){
            coda.add(m);
        }
        else {
            m.setNumOrdineLavorazione(++numLavorazione);
            Riparazione r = new Riparazione(nomeRiparazione, costoLavorazione);
            m.addRip(r);
            officina.set(postoLibero(),m);
        }   
    }
    
    public void exit(int n) throws OfficinaException {
        if(n >= this.numPosti || officina.get(n) == null)
            throw new OfficinaException("Il posto non esiste oppure è vuoto");
        if(coda.size()>0) {
            officina.set(n, coda.get(0));
            coda.remove(0);
        } else {
            officina.set(n,null);
        }                 
    }
    
    private void init() {
        for(int i=0; i<numPosti; i++)
            officina.add(null);
    }
    
    private int postoLibero() {
        return officina.indexOf(null);
    }
    
}
