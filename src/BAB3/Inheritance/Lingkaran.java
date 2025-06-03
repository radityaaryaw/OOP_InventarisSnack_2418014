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
public class Lingkaran {
//  attribut
    int r;
    double phi,luas;
    
//    construtor
    public Lingkaran(){
        r = 7;
        phi = 3.14;
    }
//    method
    void Deskripsi(){
        System.out.println(" Ini adalah hasil menghitung");
    }
//    method untuk menghitung luas
    double luas(){
        luas=(phi*r*r);
        return luas; 
    }
}

