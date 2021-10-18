/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_poulenas;

/**
 *
 * @author Poulenas
 */
public class BouteilleBiere {
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverture;


    public void lireEtiquette() {
        System.out.println("Bouteille de " +nom+"(" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    
    public boolean Décapsuler() {
        if (ouverture==false){
            ouverture=true;
            System.out.println(ouverture);
            return ouverture;
        }else {
            System.out.println("erreur : bière est déjà ouverte");
            ouverture = false;
            System.out.println(ouverture);
            return ouverture;
        }
    }
    
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? "; 
    if (ouverture == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}

  
    
    
    
    
    
    
    
    
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie ) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverture = false;

}
}


