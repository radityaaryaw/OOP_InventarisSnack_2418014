/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB5.Overload_Override;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class BangunDatar {
    public double Luas() {
        return 0;
    }
    
    public int Luas(int p, int l){
         return ( p * l );
     }

     public double Luas(double r){
         return (( r * r ) * 3.14);
     } 
 }

