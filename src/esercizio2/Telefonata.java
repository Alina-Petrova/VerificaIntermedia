/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

/**
 *
 * @author utente
 */
public class Telefonata {
    private String numeroTelefono;
    int minuti;

    public Telefonata(String numeroTelefono, int minuti) {
        this.numeroTelefono = numeroTelefono;
        this.minuti = minuti;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getMinuti() {
        return minuti;
    }

    @Override
    public String toString() {
        return "verso numero " + numeroTelefono + " di durata " + minuti + "\n";
    }
    
    
}
