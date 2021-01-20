/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

/**
 *
 * @author utente
 */
public interface Riparabile {
    
    public void setNumOrdineLavorazione(int numOrdineLavorazione);
    public void addRip(Riparazione r);
    public int getNumOrdineLavorazione(); 
    public float getCostoTotRip();
}
