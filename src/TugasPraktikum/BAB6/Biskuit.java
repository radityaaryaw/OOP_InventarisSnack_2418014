/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB6;

import javax.swing.JOptionPane;
public class Biskuit extends Snack {
    // Deklarasi atribut dengan enkapsulasi
    private String kadaluarsa; // Menyimpan data tanggal kadaluwarsa biskuit
    private String rasa; // Menyimpan data rasa biskuit
    private String kemasan; // Menyimpan data jenis kemasan biskuit
    private int berat_snack; // Menyimpan data berat biskuit dalam gram
    
    //Setter & getter atribut kadaluarsa
    public void setKadaluarsa(String kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }
    public String getKadaluarsa(){
        return kadaluarsa;
    }
    
    //Setter & getter atribut rasa
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public String getRasa(){
        return rasa;
    }
    
    //Setter & getter atribut kemasan
    public void setKemasan(String kemasan) {
        this.kemasan = kemasan;
    }
    public String getKemasan(){
        return kemasan;
    }
    
    //Setter & getter atribut berat snack
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
        JOptionPane.showMessageDialog(null, "Penambahan Stok Snack Berhasil! Stok Terkini: " + stok_snack); 
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
    
    //overloading method
    int setHarga(int harga, int diskon) {
        int hargadiskon = harga - (harga * diskon / 100);
        return hargadiskon;
    }
}

