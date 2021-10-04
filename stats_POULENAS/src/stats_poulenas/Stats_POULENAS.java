/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_poulenas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA
 * Exercice 4 : statistiques
 * 04/10/2021
 */
public class Stats_POULENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int Tableau [];
        Tableau = new int [6];
        System.out.println("Saisisez un nombre entier");
        float m=sc.nextInt();
        int i=0;
        while (i<m) {
            int nombre = generateurAleat.nextInt(6);
            Tableau[nombre]=Tableau[nombre]+1;
            i=i+1;
        }
        int j=0;
        while (j<6) {
            System.out.println("Il y a eu "+Tableau[j]/m*100.0+" %, de "+(j+1));
            j=j+1;
        }
                
    }
    
}
