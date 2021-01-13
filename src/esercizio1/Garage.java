/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.ArrayList;

/**
 *
 * @author utente
 */
public class Garage {
    static ArrayList<VeicoloMotore> elencoVeicoli = new ArrayList<VeicoloMotore>();
    
    
    
    public static void ImmissioneVeicolo(VeicoloMotore veicolo) {
        VeicoloMotore v = veicolo;
        elencoVeicoli.add(v);
    }
    
    public static VeicoloMotore EstrazioneVeicolo(int index) {
        VeicoloMotore v = elencoVeicoli.get(index);
        elencoVeicoli.remove(index);
        return v;           
    }
    
    public static String SituazioneGarage() {
        String ris = "";        
        for(VeicoloMotore v: elencoVeicoli) {
            ris += v.toString();
        }
        return ris;
    }
}
