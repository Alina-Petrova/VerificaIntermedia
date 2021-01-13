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
public abstract class VeicoloMotore {
    private String marca;
    private int anno;
    private int cilindrata;

    public VeicoloMotore(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        String ris = "";
        ris = "Marca: "+getMarca()+" cilindrata: "+getCilindrata()+" dell'anno: "+getAnno();
        return ris;
    }
    
    
}
