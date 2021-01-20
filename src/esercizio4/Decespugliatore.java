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
public class Decespugliatore extends Macchinario{
    private final boolean accensioneElettrica;

    public Decespugliatore(Marca marca, boolean accensioneElettrica) {
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
            ris+="elettrica "+super.toString();
        else
            ris+="non elettrica "+super.toString();
        return ris;
    }
    
    
}
