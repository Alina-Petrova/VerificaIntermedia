/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

import java.util.Objects;

/**
 *
 * @author utente
 */
public abstract class VeicoloMotore {
    public enum Marca {Alfa_Romeo,Audi,Bentley,BMW,Cadillac,Chevrolet,Citroën,Ferrari,Fiat,Ford,Honda,Jaguar,Lexus};
    private final Marca marca;
    private final int anno;
    private final int cilindrata;
    private static int counter;
    private final int id;

    public VeicoloMotore(Marca marca, int anno, int cilindrata) {
        this.id = ++counter;
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
        ris = "id = "+id+" Marca: "+getMarca()+" cilindrata: "+getCilindrata()+" dell'anno: "+getAnno();
        return ris;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.marca);
        hash = 41 * hash + this.anno;
        hash = 41 * hash + this.cilindrata;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VeicoloMotore other = (VeicoloMotore) obj;
        if (this.anno != other.anno) {
            return false;
        }
        if (this.cilindrata != other.cilindrata) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.marca != other.marca) {
            return false;
        }
        return true;
    }
    
    
}
