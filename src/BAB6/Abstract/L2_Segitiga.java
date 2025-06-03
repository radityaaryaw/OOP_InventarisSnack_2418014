/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.Abstract;

/**
 *
 * @author Raditya Arya Wiguna
 */
public abstract class L2_Segitiga {
    public double alas,tinggi,luas; //atribut
    public double Luas(){ //konstruktor
        luas = 0.5*(alas *tinggi);
        return luas;
    }  
    
    abstract double Volume(); //abstract method
}

