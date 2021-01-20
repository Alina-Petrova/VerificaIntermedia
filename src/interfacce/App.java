/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacce;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author utente
 */
public class App {
    
   public static void main(String[] args) {
        List<Ordinabile> persone = Arrays.asList(new Persona("mario",45), new Persona("anna", 30), new Persona("maria", 55)); 
        List<Ordinabile> computers = Arrays.asList(new Computer("HP", 500), new Computer("Asus", 250), new Computer("Acer",1000));
        ordina(persone);
        for(Ordinabile p: persone)
            System.out.print(p.toString());
        ordina(computers);
        for(Ordinabile c: computers)
            System.out.print(c.toString());


        
    }
   private static void ordina(List<Ordinabile> list) {
            boolean cond;
            do {
             cond = false;
             for(int i=0; i<list.size()-1; i++) {
                 if(list.get(i).confronta(list.get(i+1))>=0){
                     cond = true;
                          Ordinabile o = list.get(i);
                          list.set(i, list.get(i+1));
                          list.set(i+1,o);
                 }
             }
            }while(cond);       
    }
}
