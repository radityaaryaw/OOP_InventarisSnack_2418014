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
public class HitungLimas {
    private double LuasAlas;
    public double tinggi;
    double volume;
    
    public void setLuasAlas(double LuasAlas) {
        this.LuasAlas = LuasAlas;
    }

    public double getLuasAlas() {
        return LuasAlas;
    }
    
    double volumeLimas() {
        volume = (getLuasAlas() * tinggi) / 3;
        return volume;
    } 
}
