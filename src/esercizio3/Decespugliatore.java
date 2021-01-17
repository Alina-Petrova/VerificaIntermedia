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
public class Decespugliatore extends Macchinario{
    private final boolean accensioneElettrica;

    public Decespugliatore(String marca, boolean accensioneElettrica) {
        super(marca);
        this.accensioneElettrica = accensioneElettrica;
    }

    public boolean isAccensioneElettrica() {
        return accensioneElettrica;
    }

    @Override
    public String toString() {        
        String ris = "";        
        ris += "Decespugliatore con l'accensione ";
        if(accensioneElettrica)
            ris+="accensione elettrica "+super.toString();
        else
            ris+="accensione non elettrica "+super.toString();
        return ris;
    }
    
    
}
