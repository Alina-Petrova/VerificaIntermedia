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
   // Auto a = new Auto("Audi", 2012, 1000, "benzina", 4);
    
    public static void main(String[] args) {
        VeicoloMotore v;
        String tipo = "";
        
        Auto a = new Auto("Audi", 2012, 1000, "benzina", 4);
        Garage.ImmissioneVeicolo(a);
        Moto m = new Moto("Honda", 2020, 500, 4);
        Garage.ImmissioneVeicolo(m);
        Furgone f = new Furgone("Fiat", 2013, 1500, 85);
        Garage.ImmissioneVeicolo(f);
        a = new Auto("Dacia", 2019, 1000, "benzina", 5);
        Garage.ImmissioneVeicolo(a);
        
        System.out.println(Garage.SituazioneGarage());
        
        v = Garage.EstrazioneVeicolo(1);
        
        if(v instanceof Auto)
            tipo = "Auto ";
        if(v instanceof Moto)
            tipo = "Moto ";
        if(v instanceof Furgone)
            tipo = "Furgone ";
        System.out.println("Uscito "+tipo+v.toString());
        System.out.println(Garage.SituazioneGarage());
        
    }
}
