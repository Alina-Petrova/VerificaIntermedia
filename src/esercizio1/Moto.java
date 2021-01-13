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
public class Moto extends VeicoloMotore {
    private int tempi;

    public Moto(String marca, int anno, int cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    public int getTempi() {
        return tempi;
    }

    @Override
    public String toString() {
        String ris = "";
        ris = super.toString()+" motore a "+getTempi()+" tempi\n";
        return ris;
//return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
