/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB8;

/**
 *
 * @author Raditya Arya Wiguna
 */

public abstract class Snack {
    protected String id_snack; //menyimpan data id
    protected String nama_snack; //menyimpan data nama snack
    protected String kategori; //menyimpan data kategori
    protected int harga; //di protected agar bisa dipanggil di konstruktor child class
    protected int stok_snack; //menyimpan data stok
    protected int jumlah_tambah, jumlah_kurang; //menyimpan data penambahan & pengurangan stok
    
    abstract int tambahStok();
    abstract int penjualanProduk();
}
   