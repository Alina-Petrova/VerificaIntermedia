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
public class Auto extends VeicoloMotore {
    public enum Alimentazione {BENZINA,GPL,METANO,DIESEL};
    private Alimentazione alimentazione;
    private int numeroPorte;

    public Auto(Marca marca, int anno, int cilindrata, Alimentazione alimentazione, int numeroPorte) {
        super(marca, anno, cilindrata);
        this.alimentazione = alimentazione;
        this.numeroPorte = numeroPorte;
    }

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    @Override
    public String toString() {
        String ris = "";
        ris = super.toString()+" alimentata a "+getAlimentazione()+" ha "+getNumeroPorte()+" porte.\n";
        return ris;
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
