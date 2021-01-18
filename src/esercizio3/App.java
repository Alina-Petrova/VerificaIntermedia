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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("COMINCIAMO");
            Officina off1 = new Officina(5);
            Motozappa m1 = new Motozappa(Macchinario.Marca.EINHELL, 3);
            Decespugliatore d1 = new Decespugliatore(Macchinario.Marca.HONDA, true);
            Tosaerba t1 = new Tosaerba(Macchinario.Marca.BENASSI, 4);
            Motozappa m2 = new Motozappa(Macchinario.Marca.TACKLIFE, 2);
            Decespugliatore d2 = new Decespugliatore(Macchinario.Marca.GARDENITALIA, false);
            Tosaerba t2 = new Tosaerba(Macchinario.Marca.HONDA, 3);
            Motozappa m3 = new Motozappa(Macchinario.Marca.EINHELL, 3);
            Decespugliatore d3 = new Decespugliatore(Macchinario.Marca.HONDA, true);
            Tosaerba t3 = new Tosaerba(Macchinario.Marca.BENASSI, 4);
            Motozappa m4 = new Motozappa(Macchinario.Marca.TACKLIFE, 2);
            Decespugliatore d4 = new Decespugliatore(Macchinario.Marca.GARDENITALIA, false);
            Tosaerba t4 = new Tosaerba(Macchinario.Marca.HONDA, 3);
            
            Riparazione r = new Riparazione(Riparazione.nomeRip.CAMBIO_RUOTA,15);
            off1.enter(m1, r);
            r = new Riparazione(Riparazione.nomeRip.CAMBIO_OLIO, 10);
            off1.enter(d4, r);
            r = new Riparazione(Riparazione.nomeRip.RIPARAZIONE_PARTI_MECCANICI, 30);
            off1.enter(m3, r);
            r = new Riparazione(Riparazione.nomeRip.RIPARAZIONE_CIRCUITO_ELETTRICO, 45);
            off1.enter(d3, r);
            r = new Riparazione(Riparazione.nomeRip.CAMBIO_RUOTA, 20);
            off1.enter(t2, r);
            r = new Riparazione(Riparazione.nomeRip.RIPARAZIONE_CIRCUITO_ELETTRICO, 45);
            off1.enter(d2, r);
            r = new Riparazione(Riparazione.nomeRip.CAMBIO_OLIO, 10);
            off1.enter(t1, r);
            
            off1.situazioneOfficina();
            
            off1.exit(2);
            System.out.println("------------Si è liberato il posto 2-------------\n");
            off1.situazioneOfficina();
            
            off1.exit(1);
            
            System.out.println("------------Si è liberato il posto 1 -------------\n");
            off1.situazioneOfficina();
            
            off1.exit(4);
            off1.exit(5);
            
            System.out.println("------------Si è liberato il posto 4 e 5-------------\n");
            off1.situazioneOfficina();
            
            r = new Riparazione(Riparazione.nomeRip.RIPARAZIONE_PARTI_MECCANICI,75);
            off1.enter(m1, r);
            r = new Riparazione(Riparazione.nomeRip.RIPARAZIONE_CIRCUITO_ELETTRICO, 23);
            off1.enter(d4, r);
            
            off1.situazioneOfficina();
            
            
        } catch (Exception e) {
            System.out.println("Oops qualcosa è andato storto...");
        }   

    }
    
}
