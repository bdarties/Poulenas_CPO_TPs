/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_poulenas;

import java.util.Scanner;



/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA
 * Exercice 2 convertisseur
 * 18.10.2021
 */
public class TP2_convertisseurObjet_POULENAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        double temperature;
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Celcius vers Farenheit \n4) De Farenheit vers Celcius \n5) De Kelvin vers Farenheit \n6) De Farenheit vers Kelvin");
        int choix;
        choix = sc.nextInt();
        System.out.println("Bonjour saisisez une temperarure  :");
        temperature = sc.nextDouble();
        Convertisseur conversion = new Convertisseur();
        if (choix==1){
            conversion.CelciusVersKelvin(temperature);
            System.out.println(conversion); 
        }else if (choix==2){
            conversion.KelvinVersCelcius(temperature);
            System.out.println(conversion);
        }else if (choix==3){
            conversion.CelciusVersFarenheit(temperature);
            System.out.println(conversion);
        }else if (choix==4){
            conversion.FarenheitVersCelcius(temperature);
            System.out.println(conversion);
        }else if (choix==5){
            conversion.KelvinVersFarenheit(temperature);
            System.out.println(conversion);
        }else if (choix==6){
            conversion.FarenheitVersKelvin(temperature);
            System.out.println(conversion);
        }
    }
    
}
