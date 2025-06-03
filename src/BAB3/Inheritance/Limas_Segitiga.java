/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritance;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Limas_Segitiga extends Segitiga {
    double t,vol;  
    double volumeLimas(){
        vol = (Luas()*t)/3;
        return vol;
    } 
}

