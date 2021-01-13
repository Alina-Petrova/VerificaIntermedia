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
    private String alimentazione;
    private int numeroPorte;

    public Auto(String marca, int anno, int cilindrata, String alimentazione, int numeroPorte) {
        super(marca, anno, cilindrata);
        this.alimentazione = alimentazione;
        this.numeroPorte = numeroPorte;
    }

    public String getAlimentazione() {
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
