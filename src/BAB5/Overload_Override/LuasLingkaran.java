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
public class LuasLingkaran extends BangunDatar{
    double r; 
    @Override
    public double Luas() {
        return Luas(r);
    }
}

