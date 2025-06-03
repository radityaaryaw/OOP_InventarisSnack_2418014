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
public class L1_SegiTigaSamaKaki extends L1_BangunDatar implements L1_Keliling{
    public double alas, tinggi;
    public double a,b,c;
    
    @Override
    public double hitungluas() {
        return ((alas * tinggi)/2);
    }
    @Override
    public void tampilHasil() {
        System.out.println("Luas Segitiga = "+ hitungluas());
        System.out.println("Kelilng Segitiga = "+ hitungKeliling());
    }
    @Override
    public double hitungKeliling() {
        return (a+b+c);
    } 

    
}
