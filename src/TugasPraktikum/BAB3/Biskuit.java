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
public class Biskuit extends Snack {
    String kadaluarsa;
    String rasa;
    String kemasan;
    int berat_snack;
    
    public Biskuit(int harga) {
        this.harga = harga;  // Menggunakan harga dari parent class
    }
    
    int hargaperGram() {
        return harga / berat_snack;  
    }
}

