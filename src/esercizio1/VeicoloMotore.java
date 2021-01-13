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
    public enum Marca {Alfa_Romeo,Audi,Bentley,BMW,Cadillac,Chevrolet,Citroën,Ferrari,Fiat,Ford,Honda,Jaguar,Lexus};
    private Marca marca;
    private int anno;
    private int cilindrata;

    public VeicoloMotore(Marca marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public Marca getMarca() {
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
