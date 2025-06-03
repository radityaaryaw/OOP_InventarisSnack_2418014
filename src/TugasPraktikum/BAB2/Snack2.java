/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB2;

/**
 *
 * @author Raditya Arya Wiguna
 */
import java.text.DecimalFormat; // Mengimpor library untuk format angka dengan pemisah ribuan

public class Snack2 {
    //ATRIBUT
    String id_snack; //menyimpan data nilai id
    String nama_snack; //menyimpan data nilai nama
    float harga; //menyimpan data nilai harga
    int stok_snack; //menyimpan data nilai stok
    
    //METHOD KONSTRUKTOR
    public Snack2(String nama, String id, float harga, int stok) { 
        //memanggil atribut saat objek telah dibuat
        this.nama_snack = nama;
        this.id_snack = id;
        this.harga = harga;
        this.stok_snack = stok;
    }
    
    //METHOD MENAMBAHKAN STOK
    public void tambahStok(int jumlah) {
        stok_snack += jumlah; //akan menambahkan jumlah stok
        System.out.println(jumlah + " " + nama_snack + " ditambahkan | STOK TERKINI : " + stok_snack);
    }
    
    //METHOD MENGURANGI STOK
    public void kurangiStok(int jumlah) {
        if (stok_snack >= jumlah) { //kondisi jika stok lebih besar dibandingkan jumlah
            stok_snack -= jumlah; //akan mengurangi jumlah stok
            System.out.println(jumlah + " " + nama_snack + " terjual | STOK TERKINI : " + stok_snack);
        } else { //kondisi jika stok kurang dari jumlah permintaan
            System.out.println("Stok " + nama_snack + " tidak mencukupi!");
        }
    }
    
    //METHOD INFO PRODUK
    public void infoProduk() {
        DecimalFormat df = new DecimalFormat("#,###"); //format angka
        System.out.println("ID Produk : " + id_snack);
        System.out.println("Nama Produk : " + nama_snack);
        System.out.println("Harga Satuan : Rp. " +  df.format(harga)); //implementasi format angka
        System.out.println("Stok Produk : " + stok_snack + "\n");
    }
    
    //MAIN CLASS / METHOD UTAMA MENJALANKAN PROGRAM
    public static void main(String[] args) {
        //Implementasi pembuatan objek dengan atribut yang telah diinisialisasikan di method konstruktor
        Snack2 snack1 = new Snack2("Keripik Talas Ungu", "SN001", 20000, 13);
        Snack2 snack2 = new Snack2("Basreng Pedas Daun Jeruk", "SN002", 18000, 23);
        Snack2 snack3 = new Snack2("Pisang Cokelat", "SN003", 22000, 10);
        
        //Informasi awal stok produk
        System.out.println("==========================================================");
        System.out.println("LAPORAN STOK SNACK | DIDIEUSNACK");
        System.out.println("==========================================================");
        snack1.infoProduk();
        snack2.infoProduk();
        snack3.infoProduk();

        snack1.tambahStok(5);
        snack2.kurangiStok(11);
        snack3.kurangiStok(12);
        
        //Informasi akhir stok produk setelah pengurangan & penambahan stok
        System.out.println("\n==========================================================");
        System.out.println("LAPORAN TERKINI STOK SNACK | DIDIEUSNACK");
        System.out.println("==========================================================");
        snack1.infoProduk();
        snack2.infoProduk();
        snack3.infoProduk();
    }
}
