/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB9;

import javax.swing.JOptionPane;

public class Keripik extends Snack {
    // Deklarasi atribut dengan enkapsulasi
    private String bahanUtama; //menyimpan nilai bahan utama
    private String varianBumbu; //menyimpan nilai varian
    private int berat_snack; //menyimpan nilai berat snack
    int level_pedas; //menyimpan nilai level kepedesan
    
    public Keripik() {
        this.level_pedas = 0;
    }
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
    
    @Override
    //implementasi abstract method 
    int tambahStok() {
        stok_snack += jumlah_tambah;
        return stok_snack;
    }
    @Override
    int penjualanProduk() {
        if (stok_snack >= jumlah_kurang) {
            stok_snack -= jumlah_kurang; // Mengurangi stok sesuai jumlah penjualan
            JOptionPane.showMessageDialog(null, "Penjualan Berhasil! Sisa Stok: " + stok_snack);
        } else {
            JOptionPane.showMessageDialog(null, "Stok " + nama_snack + " tidak mencukupi!");
        }
        return stok_snack; // Mengembalikan jumlah stok terbaru
    }
}
