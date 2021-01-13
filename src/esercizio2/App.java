/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.ArrayList;

/**
 *
 * @author utente
 */
public class App {
    static ArrayList<Sim> elencoSim = new ArrayList<Sim>();
    
    public static void main(String[] args) {
        Sim s = new Sim("3404565432", 0);
        elencoSim.add(s);
        s = new Sim("3492345489", 15);
        elencoSim.add(s);
        Telefonata t = new Telefonata("3424563281", 12);
        elencoSim.get(0).addTelefonata(t);
        t = new Telefonata("347654089421", 45);
        elencoSim.get(0).addTelefonata(t);
        t = new Telefonata("347654089421", 2);
        elencoSim.get(1).addTelefonata(t);
        
        for(Sim sim: elencoSim) {
            System.out.println(sim.toString());
        }
    }
}
