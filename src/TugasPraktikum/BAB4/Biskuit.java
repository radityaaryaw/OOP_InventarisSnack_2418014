/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB4;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Biskuit extends Snack {
    private String kadaluarsa; // Menyimpan data tanggal kadaluwarsa biskuit
    private String rasa; // Menyimpan data rasa biskuit
    private String kemasan; // Menyimpan data jenis kemasan biskuit
    private int berat_snack; // Menyimpan data berat biskuit dalam gram
    
    public Biskuit(int harga) {
        setHarga(harga); // Menggunakan setter dari parent class
    }
    
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
    
    private int hargaperGram() {
        return getHarga() / berat_snack;  // Menggunakan getter dari parent class
    }
    
    protected int gethargaperGram() {
        return hargaperGram();
    }
}

