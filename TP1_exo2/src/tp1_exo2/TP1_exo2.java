/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_exo2;

import java.util.Scanner;

/**
 *
 * @author Poulenas
 * Poulenas Sandra
 * TDA
 * convertiseur de température 
 * 04/10/2021
 */
public class TP1_exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc; 
        sc = new Scanner(System.in);
        double temperature;

        // ok 
        System.out.println("Bonjour saisisez une valeur :");
        temperature = sc.nextFloat();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius \n3) De Celcius vers Farenheit \n4) De Farenheit vers Celcius \n5) De Kelvin vers Farenheit \n6) De Farenheit vers Kelvin");
        int choix;
        choix = sc.nextInt();
        
        if (choix == 1) {
        double temperatureDemandee = CelciusVersKelvin(temperature);
        System.out.println(temperature+" degré Celcius est égal à"+temperatureDemandee+" degrés Kelvin");
        }
        
        if (choix == 2) {
        double temperatureDemandee = KelvinVersCelcius(temperature);
        System.out.println(temperature+" degré Kelvin est égal à"+temperatureDemandee+" degrés Celcius");
        }
        
        if (choix == 3) {
        double temperatureDemandee = CelciusVersFarenheit(temperature);
        System.out.println(temperature+" degré Celcius est égal à"+temperatureDemandee+" degrés Farenheit");
        }
        
        if (choix == 4) {
        double temperatureDemandee = FarenheitVersCelcius(temperature);
        System.out.println(temperature+" degré Ferenheit est égal à"+temperatureDemandee+" degrés Celcuis");
        }
        
        if (choix == 5) {
        double temperatureDemandee = KelvinVersFarenheit(temperature);
        System.out.println(temperature+" degré Kelvin est égal à"+temperatureDemandee+" degrés Farenheit");
        }
        
        if (choix == 6) {
        double temperatureDemandee = FarenheitVersKelvin(temperature);
        System.out.println(temperature+" degré Farenheit est égal à"+temperatureDemandee+" degrés Kelvin");
        }
        //double temperatureK;
        //temperatureK = CelciusVersKelvin (temperatureC) ;
        //System.out.println("La température en Kelvin est :"+temperatureK);
        //double temperatureF;
        //temperatureF=CelciusVersFarenheit(temperatureC);
        //System.out.println("La température en Farenheit est :"+temperatureF);
                
        
        
        
    }
public static float CelciusVersKelvin ( double temperatureC) {
    double temperatureK = temperatureC+273.15;
    return (float) temperatureK;
    }

public static float KelvinVersCelcius ( double temperatureK) {
    double temperatureC = temperatureK-273.15;
    return (float) temperatureC;

    }

public static float CelciusVersFarenheit ( double temperatureC) {
    double temperatureF = (temperatureC*1.8)+32;
    return (float) temperatureF;
}

public static float FarenheitVersCelcius (double temperatureF) {
    double temperatureC = (temperatureF-32)/1.8;
    return (float) temperatureC;
}
public static float KelvinVersFarenheit (double temperatureK) {
    double temperatureC = KelvinVersCelcius(temperatureK);
    double temperatureF= CelciusVersFarenheit(temperatureC);
    return (float) temperatureF;
}

public static float FarenheitVersKelvin (double temperatureF) {
    double temperatureC=FarenheitVersCelcius(temperatureF);
    double temperatureK=CelciusVersKelvin(temperatureC);
    return (float) temperatureK;
}
}
