/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB3;

/**
 *
 * @author Raditya Arya Wiguna
 */

//PARENT CLASS
public class Snack {
    String id_snack; //menyimpan data id
    String nama_snack; //menyimpan data nama snack
    String kategori; //menyimpan data kategori
    protected int harga; //di protected agar bisa dipanggil di konstruktor child class
    int stok_snack; //menyimpan data stok
    int jumlah_tambah, jumlah_kurang; //menyimpan data penambahan & pengurangan stok

    int tambahStok() { //method parent
        return stok_snack += jumlah_tambah; //menambahkan stok sesuai dengan jumlah
    }
    
    int penjualanProduk() { //method parent
        if (stok_snack >= jumlah_kurang) {
            stok_snack -= jumlah_kurang; //mengurangi jumlah stok sesuai dengan data penjualan
        } else {
            System.out.println("Stok " + nama_snack + " tidak mencukupi!");
        }
        return stok_snack; // tetap mengembalikan nilai stok terakhir
    }
   
}
