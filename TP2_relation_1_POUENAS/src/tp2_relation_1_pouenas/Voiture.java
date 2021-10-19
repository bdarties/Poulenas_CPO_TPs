/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_pouenas;

import static java.lang.constant.ConstantDescs.NULL;


/**
 *
 * @author Poulenas
 */
public class Voiture {
    String modele;
    String marque;
    int PuissanceCV;
    Personne Proprietaire;

    public Voiture(String unModele , String uneMarque, int unePuissance) {
        modele = unModele;
        marque= uneMarque;
        PuissanceCV= unePuissance;
        Proprietaire=(Personne) NULL;
        
    }       
        
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = modele+" "+marque+" "+PuissanceCV+" chevaux";
    return chaine_a_retourner ;  
}
}
