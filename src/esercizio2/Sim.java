/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio2;

import java.util.ArrayList;


/**
 *
 * @author utente
 */
public class Sim {
    private static String numeroTelefono;
    private float credito;
    private ArrayList<Telefonata> listaTelefonate;

    public Sim(String numeroTelefono, float credito) {
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.listaTelefonate = new ArrayList<Telefonata>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public float getCredito() {
        return credito;
    }

    public ArrayList<Telefonata> getListaTelefonate() {
        return listaTelefonate;
    }
    
    public void addTelefonata(Telefonata telefonata) {
        listaTelefonate.add(telefonata);
    }
          
    public int minutiConsumati() {
        int ris = 0;
        for(Telefonata t : listaTelefonate) {
            ris += t.getMinuti();
        }
        return ris;
    }
    
    public int telefonateVerso(String numero) {
        int ris = 0;
        for(Telefonata t : listaTelefonate){
            if(t.getNumeroTelefono().equals(numero))
                ris++;
        }
        return ris;
    }

    @Override
    public String toString() {
        String ris = "";
        ris = "Numero di telefono: "+numeroTelefono+" credito= "+getCredito()+"\n";
        ris += "Lista delle telefonate effettuate:\n";
        for(Telefonata t : listaTelefonate)
            ris += t.toString();
        return ris;
    }
    
    
}
