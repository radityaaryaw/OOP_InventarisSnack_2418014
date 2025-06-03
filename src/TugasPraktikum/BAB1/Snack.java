/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB1;

/**
 *
 * @author Raditya Arya Wiguna
 */
import java.text.DecimalFormat;

public class Snack {
    String id_snack;
    String nama_snack;
    float harga;
    int stok_snack;
    
    void setIdsnack(String id_snack) {
        this.id_snack = id_snack;
    }
    void setNamasnack(String nama_snack) {
        this.nama_snack = nama_snack;
    }
    void setHarga(float harga) {
        this.harga = harga;
    }
    void setStoksnack(int stok_snack) {
        this.stok_snack = stok_snack;
    }
    
    String getNama() {
        return nama_snack;
    }
    
    float getHarga() {
        return harga;
    }
    
    int getStok() {
        return stok_snack;
    }
    
    String getID() {
        return id_snack;
    }
    
}
