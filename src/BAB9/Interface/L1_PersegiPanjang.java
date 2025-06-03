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
public class L1_PersegiPanjang extends L1_BangunDatar implements L1_Keliling, L1_SimetriBangunDatar {

    public double panjang,lebar;

    @Override
    public double hitungluas() {
        return (panjang * lebar);
    }
    @Override
    public void tampilHasil() {
        System.out.println("Luas Persegi panjang = " + Double.toString(hitungluas()));
        System.out.println("Keliling Persegi Panjang = " + Double.toString(hitungKeliling()));
        System.out.println("Banyak simetri Putar = "+ hitungSimetriputar());
    }
    @Override
    public double hitungKeliling() {
        return (2*(panjang * lebar));
    }
    @Override
    public double hitungSimetriputar() {
        return 2.0;
    }

    
}
