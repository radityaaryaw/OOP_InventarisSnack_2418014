/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Segitiga {
    private double alas; //modifier private
    public double tinggi; //modifier public
    double Luas; //modifier default
    
    public void setAlas (double alas){
        this.alas = alas;
    }
    
    public double getAlas(){
        return alas;
    }
    
    double Luas(){ //hak akses default (tidak ada modifier)
        Luas = (getAlas()*tinggi)/2;
        return Luas;
    }
}

