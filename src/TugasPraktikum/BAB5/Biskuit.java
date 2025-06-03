/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB5;

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
    //overriding method
    protected int getTambahstok() {
        int hasil = super.getTambahstok(); // Tetap hitung stok dari parent
        JOptionPane.showMessageDialog(null, "Penambahan Stok Snack Berhasil! Stok Terkini: " + hasil); 
        return hasil;
    }
    //overloading method
    protected void setHarga(int harga, int diskon) {
        int hargadiskon = harga - (harga * diskon / 100);
        super.setHarga(hargadiskon); // menggunakan setter dari parent untuk menyimpan
    }
}

