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
public class CH_Mobil extends CH_Kendaraan {
    String warna;
    
    public CH_Mobil(){
        this.merk = "Ferrari 488 GTB";
        this.warna = "Hitam";
        this.km = 340;
    }
    @Override
    double kecepatan() {
        return km;
    }

    @Override
    String jenis() {
        return merk;
    }  
}
