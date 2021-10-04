/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;
import java.util.Scanner;

 /**
 *
 * @author Poulenas
 *Poulenas Sandra
 * TDA
 * TP1 saisie et manipulation de nombre
 * 04/10/2021
 */
 
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        int nombre1;
        int nombre2;
        System.out.println("Saissir un premier nombre");
        nombre1=sc.nextInt();
        System.out.println("Saisir un second nombre");
        nombre2=sc.nextInt();
        int somme;
        somme = nombre1+nombre2;
        System.out.println("La somme est :"+somme);
        int difference;
        difference = nombre1-nombre2;
        System.out.println("La difference est :"+difference);
        int produit;
        produit=nombre1*nombre2;
        System.out.println("Le produit est :"+produit);
        int quotien;
        quotien = nombre1/nombre2;
        System.out.println("Le quotien entier vaut :"+quotien);
        int reste;
        reste =nombre1%nombre2;
        System.out.println("Le reste de la division est"+reste);
             
                
    }
}