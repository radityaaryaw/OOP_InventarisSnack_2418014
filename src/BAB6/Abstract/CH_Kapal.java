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
public class CH_Kapal extends CH_Kendaraan {
    double bobot;
    
    public CH_Kapal(){
        this.merk = "Pesiar Icon of the Seas ";
        this.bobot = 250800;
        this.km = 37;
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
