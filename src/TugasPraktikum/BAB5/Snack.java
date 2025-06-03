/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB5;

/**
 *
 * @author Raditya Arya Wiguna
 */

public class Snack {
    private String id_snack; //menyimpan data id
    public String nama_snack; //menyimpan data nama snack
    public String kategori; //menyimpan data kategori
    private int harga; //di protected agar bisa dipanggil di konstruktor child class
    private int stok_snack; //menyimpan data stok
    private int jumlah_tambah, jumlah_kurang; //menyimpan data penambahan & pengurangan stok
    
    
    //Setter & getter atribut ID
    public void setID(String id_snack) {
        this.id_snack = id_snack;
    }
    
    public String getID(){
        return id_snack;
    }
    
    //Setter & getter atribut harga
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }
    
    //Setter & getter atribut jumlah tambah
    public void setTambah(int jumlah_tambah) {
        this.jumlah_tambah = jumlah_tambah;
    }
    public int getTambah(){
        return jumlah_tambah;
    }
    
    //Setter & getter atribut jumlah kurang
    public void setPenjualan(int jumlah_kurang) {
        this.jumlah_kurang = jumlah_kurang;
    }
    public int getPenjualan(){
        return jumlah_kurang;
    }
    
    //Setter & getter atribut stok
    public void setStok(int stok_snack) {
        this.stok_snack = stok_snack;
    }
    public int getStok(){
        return stok_snack;
    }

     // Fungsi untuk menambahkan stok berdasarkan jumlah_tambah
    private int tambahStok() {
        return stok_snack += jumlah_tambah;
    }
    
    // Fungsi yang bisa dipanggil oleh child class untuk menambahkan stok
    protected int getTambahstok() {
        return tambahStok();
    }
    
    // Fungsi untuk mengurangi stok saat ada penjualan
    private int penjualanProduk() {
        if (stok_snack >= jumlah_kurang) {
            stok_snack -= jumlah_kurang; // Mengurangi stok sesuai jumlah penjualan
        } else {
            System.out.println("Stok " + nama_snack + " tidak mencukupi!");
        }
        return stok_snack; // Mengembalikan jumlah stok terbaru
    }
    
    // Fungsi yang bisa dipanggil oleh child class untuk mengurangi stok
    protected int getKurangstok() {
        return penjualanProduk();
    }
}
