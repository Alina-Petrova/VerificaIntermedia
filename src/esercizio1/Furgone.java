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
public class Furgone extends VeicoloMotore{
    private int capienza;

    public Furgone(Marca marca, int anno, int cilindrata, int capienza) {
        super(marca, anno, cilindrata);
        this.capienza = capienza;
    }

    public int getCapienza() {
        return capienza;
    }

    @Override
    public String toString() {
        String ris = "";
        ris = super.toString()+", capacità di carico: "+getCapienza()+"\n";
        return ris;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
