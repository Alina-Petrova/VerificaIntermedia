/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio3;

/**
 *
 * @author utente
 */
public class Riparazione {
    private String nomeRiparazione;
    private float costoRiparazione;

    public Riparazione(String nomeRiparazione, float costoRiparazione) {
        this.nomeRiparazione = nomeRiparazione;
        this.costoRiparazione = costoRiparazione;
    }
    
    

    public String getNomeRiparazione() {
        return nomeRiparazione;
    }

    public void setNomeRiparazione(String nomeRiparazione) {
        this.nomeRiparazione = nomeRiparazione;
    }

    public float getCostoRiparazione() {
        return costoRiparazione;
    }

    public void setCostoRiparazione(float costoRiparazione) {
        this.costoRiparazione = costoRiparazione;
    }

    @Override
    public String toString() {
        return "Riparazione" + nomeRiparazione + " di costo " + costoRiparazione;
    }
    
    
}
