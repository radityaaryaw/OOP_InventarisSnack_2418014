/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB5;

import javax.swing.JOptionPane;

public class Keripik extends Snack {
    // Deklarasi atribut dengan enkapsulasi
    private String bahanUtama; //menyimpan nilai bahan utama
    private String varianBumbu; //menyimpan nilai varian
    private int berat_snack; //menyimpan nilai berat snack
    private int level_pedas; //menyimpan nilai level kepedesan

    // Setter & getter untuk bahan utama
    public void setBahan(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }
    public String getBahan(){
        return bahanUtama;
    }
    
    // Setter & getter untuk varian bumbu
    public void setVarian(String varianBumbu) {
        this.varianBumbu = varianBumbu;
    }
    public String getVarian(){
        return varianBumbu;
    }
    
    // Setter & getter untuk berat snack
    public void setBerat(int berat_snack) {
        this.berat_snack = berat_snack;
    }
    public int getBerat(){
        return berat_snack;
    }

    // Setter & getter untuk level pedas
    public void setLevelPedas(int level_pedas) {
        this.level_pedas = level_pedas;
    }
    public int LevelPedas(){ 
        return level_pedas;
    }
    
    @Override
    //overriding method
    protected int getTambahstok() {
        int hasil = super.getTambahstok(); // Tetap hitung stok dari parent
        JOptionPane.showMessageDialog(null, "Penambahan Stok Snack Berhasil! Stok Terkini: " + hasil); 
        return hasil;
    }
}
