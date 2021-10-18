/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_poulenas;

/**
 *
 * @author Poulenas
 */
public class Convertisseur {
    int nbConversions;

public float CelciusVersKelvin ( double temperatureC) {
    double temperatureK = temperatureC+273.15;
    nbConversions=nbConversions+1;
    return (float) temperatureK;
    }

public float KelvinVersCelcius ( double temperatureK) {
    double temperatureC = temperatureK-273.15;
    nbConversions=nbConversions+1;
    return (float) temperatureC;

    }

public float CelciusVersFarenheit ( double temperatureC) {
    double temperatureF = (temperatureC*1.8)+32;
    nbConversions=nbConversions+1;
    return (float) temperatureF;
}

public float FarenheitVersCelcius (double temperatureF) {
    double temperatureC = (temperatureF-32)/1.8;
    nbConversions=nbConversions+1;
    return (float) temperatureC;
}
public float KelvinVersFarenheit (double temperatureK) {
    double temperatureC = KelvinVersCelcius(temperatureK);
    double temperatureF= CelciusVersFarenheit(temperatureC);
    return (float) temperatureF;
}

public float FarenheitVersKelvin (double temperatureF) {
    double temperatureC=FarenheitVersCelcius(temperatureF);
    double temperatureK=CelciusVersKelvin(temperatureC);
    return (float) temperatureK;
}
public Convertisseur () {
 int nbConversions = 0 ;
}
@Override
public String toString () {
 return "nb de conversions "+ nbConversions;
}

}
