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
public class L2_LimasSegitiga extends L2_Segitiga{
    double vol,t;  
    @Override
    double Volume() {
        vol = (Luas()*t)/3;
        return vol;
    }
}

