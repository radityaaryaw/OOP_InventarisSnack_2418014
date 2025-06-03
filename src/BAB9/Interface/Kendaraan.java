/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Interface;

/**
 *
 * @author Raditya Arya Wiguna
 */
public abstract class Kendaraan {
    String merek;
    
    public Kendaraan (String merek) {
        this.merek = merek;
    };
    public String getMerek() {
        return merek;
    };
    abstract void carabergerak();
    abstract void kecepatanMax();
    
}
