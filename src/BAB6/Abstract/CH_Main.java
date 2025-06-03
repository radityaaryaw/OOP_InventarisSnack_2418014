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
public class CH_Main {
        public static void main(String[] args) {
        System.out.println("INFORMASI KENDARAAN");
        CH_Mobil m = new CH_Mobil();
        System.out.println("------------------------------");
        System.out.println("Mobil " + m.jenis());
        System.out.println("Warna : " + m.warna);
        System.out.println("Kecepatan : " + m.kecepatan() + " km/jam");
        System.out.println("------------------------------");
        CH_Kapal k = new CH_Kapal();
        System.out.println("Kapal " + k.jenis());
        System.out.println("Bobot : " + k.bobot + " GT");
        System.out.println("Kecepatan : " + k.kecepatan() + " km/jam");
    }
}
