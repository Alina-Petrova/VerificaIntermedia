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
    
    public void enter(Macchinario m, Riparazione r) {
        if(postoLibero() == -1){
            coda.add(m);
            m.addRip(r);
        }
        else {
            m.setNumOrdineLavorazione(++numLavorazione);
            m.addRip(r);
            officina.set(postoLibero(),m);
        }   
    }
    
    public void exit(int n) throws OfficinaException {
        if(n <1 || n > this.numPosti || officina.get(n-1) == null)
            throw new OfficinaException("Il posto non esiste oppure è vuoto");
        if(coda.size()>0) {
            coda.get(0).setNumOrdineLavorazione(++numLavorazione);
            officina.set(n-1, coda.get(0));
            coda.remove(0);
        } else {
            officina.set(n-1,null);
        }                 
    }
    
    private void init() {
        for(int i=0; i<numPosti; i++)
            officina.add(null);
    }
    
    private int postoLibero() {
        return officina.indexOf(null);
    }
    
    public void situazioneOfficina() {
         for (int i = 0; i < officina.size(); i++) {
            if (officina.get(i) != null) {
                System.out.println("--------------- POSTO " + (i+1) + "------------------");
                System.out.println(officina.get(i).toString());
                System.out.println("---------------------------------");
                System.out.println();
            }else {
                System.out.println("--------------- POSTO " + (i+1) + "------------------");
                System.out.println("--------------- LIBERO ---------------");
                System.out.println(); 
            }
                
        }
    }
}
