/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author utente
 */

public class App {

    
    public static void main(String[] args) {
        VeicoloMotore v;
        String tipo = "";
        
        try {
            
            Garage g = new Garage(7);
            Auto a = new Auto(VeicoloMotore.Marca.Audi, 2012, 1000, Auto.Alimentazione.BENZINA, 4);
            g.immissioneVeicolo(a);
            Moto m = new Moto(VeicoloMotore.Marca.Honda, 2020, 500, 4);
            g.immissioneVeicolo(m);
            Furgone f = new Furgone(VeicoloMotore.Marca.Fiat, 2013, 1500, 85);
            g.immissioneVeicolo(f);
            a = new Auto(VeicoloMotore.Marca.Ford, 2019, 1000, Auto.Alimentazione.GPL, 5);
            g.immissioneVeicolo(a);

            System.out.println(g.situazioneGarage());

            v = g.estrazioneVeicolo(1);

            if(v instanceof Auto)
                tipo = "Auto ";
            if(v instanceof Moto)
                tipo = "Moto ";
            if(v instanceof Furgone)
                tipo = "Furgone ";
            System.out.println("Uscito "+tipo+v.toString());
            System.out.println(g.situazioneGarage());
        
        }catch (Exception e) {
            System.out.println("Oops qualcosa è andato storto...");
        }
    }    
}
