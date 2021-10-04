/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_exo3;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA
 * Exercice 3 GuessMyNumber
 * 04/10/2021
 */
public class TP1_Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("Choisisez votre difficculté : \n1) Facile \n2) Normal \n3) Difficile ");
        int choix = sc.nextInt();
        if (choix==1) {
         int n1 = generateurAleat.nextInt(50); 
         System.out.println("Saisir un nombre entre 1 et 50");
         int nbUtilisateur;
         nbUtilisateur=sc.nextInt();
         int cpt = 1;
         while(nbUtilisateur!=n1){ // Tant que le nombre que l'on siasie n'est pas égal à celui de l'ordi
            if (nbUtilisateur>n1) { // Si notre nombre est trop grand
                System.out.println("Trop grand");
                nbUtilisateur=sc.nextInt(); // Resaisir un nombre
                cpt = cpt+1;// on incrémente le compteur de coups
            }else if (nbUtilisateur<n1){ // Si notre nombre est trop petit
                System.out.println("Trop petit");
                nbUtilisateur=sc.nextInt(); // Resaisir un nombre 
                cpt = cpt+1; // on incrémente le compteur de coups
            }
        }System.out.println("Vous avez gangé, en faisant "+cpt+" coups");
     
        
        }else if (choix==2){
         int n1 = generateurAleat.nextInt(100); 
         System.out.println("Saisir un nombre entre 1 et 100");
         int nbUtilisateur;
         nbUtilisateur=sc.nextInt();
         int cpt = 1;
         while(nbUtilisateur!=n1){ // Tant que le nombre que l'on siasie n'est pas égal à celui de l'ordi
            if (nbUtilisateur>n1) { // Si notre nombre est trop grand
                System.out.println("Trop grand");
                nbUtilisateur=sc.nextInt(); // Resaisir un nombre
                cpt = cpt+1;// on incrémente le compteur de coups
                if (cpt>5) {
                    System.out.println("Vous avez perdu, le nombre était "+n1);
                    break;
                }System.out.println("Vous avez gangé, en faisant "+cpt+" coups");
            }else if (nbUtilisateur<n1){ // Si notre nombre est trop petit
                System.out.println("Trop petit");
                nbUtilisateur=sc.nextInt(); // Resaisir un nombre 
                cpt = cpt+1; // on incrémente le compteur de coups
                if (cpt>5) {
                    System.out.println("Vous avez perdu, le nombre était "+n1);
                    break;
                }System.out.println("Vous avez gangé, en faisant "+cpt+" coups");
            }
           
         }
         
        }else{
         int n1 = generateurAleat.nextInt(1000); 
         System.out.println("Saisir un nombre entre 1 et 1000");
         int nbUtilisateur;
         nbUtilisateur=sc.nextInt();
         int cpt = 1;
         while(nbUtilisateur!=n1){ // Tant que le nombre que l'on siasie n'est pas égal à celui de l'ordi
            if (nbUtilisateur>n1) { // Si notre nombre est trop grand
                System.out.println("Trop grand");
                nbUtilisateur=sc.nextInt(); // Resaisir un nombre
                cpt = cpt+1;// on incrémente le compteur de coups
                if (cpt>20) {
                    System.out.println("Vous avez perdu, le nombre était "+n1);
                    break;
                }System.out.println("Vous avez gangé, en faisant "+cpt+" coups");
            }else if (nbUtilisateur<n1){ // Si notre nombre est trop petit
                System.out.println("Trop petit");
                nbUtilisateur=sc.nextInt(); // Resaisir un nombre 
                cpt = cpt+1; // on incrémente le compteur de coups
                if (cpt>20) {
                    System.out.println("Vous avez perdu, le nombre était "+n1);
                    break;
                }System.out.println("Vous avez gangé, en faisant "+cpt+" coups");
            }
        }
    }
}
}
    

