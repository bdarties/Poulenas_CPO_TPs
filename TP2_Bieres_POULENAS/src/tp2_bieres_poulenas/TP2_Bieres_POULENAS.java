/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_poulenas;

/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA
 * Exercice 1 création d'une première classe et quelques objects
 * 18.10.2021
 */
public class TP2_Bieres_POULENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson") ;
        //uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        System.out.println(uneBiere);
        BouteilleBiere uneautreBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe"); 
        //uneautreBiere.lireEtiquette();
        uneautreBiere.Décapsuler();
        System.out.println(uneautreBiere);
        BouteilleBiere unesecondeBiere = new BouteilleBiere("Depse",5.0,"Babar"); 
        //unesecondeBiere.lireEtiquette();
        unesecondeBiere.Décapsuler();
        System.out.println(unesecondeBiere);
        BouteilleBiere unetroisiemeBiere = new BouteilleBiere("PinkBear",6.6,"Petit comptoir"); 
        //unetroisiemeBiere.lireEtiquette();
        unetroisiemeBiere.Décapsuler();
        System.out.println(unetroisiemeBiere);
    }
    
}
