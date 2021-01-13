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
    
    
    
    public static void immissioneVeicolo(VeicoloMotore veicolo) {
        elencoVeicoli.add(veicolo);
    }
    
    public static VeicoloMotore estrazioneVeicolo(int index) {
        elencoVeicoli.remove(index);
        return elencoVeicoli.get(index);           
    }
    
    public static String situazioneGarage() {
        String ris = "";        
        for(VeicoloMotore v: elencoVeicoli) {
            ris += v.toString();
        }
        return ris;
    }
}
