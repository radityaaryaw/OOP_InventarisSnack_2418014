/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class l1_Karyawan {
    private String nama;
    private String id;
    private double gajiDasar;
    
    // Konstruktor 
    public l1_Karyawan(double gajiDasar) {
        this.gajiDasar = gajiDasar;
    }

    // Setter dan Getter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk ID
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Method privat untuk menghitung gaji akhir
    private double hitungGajiAkhir() {
        double tunjangan = gajiDasar * 0.2; // Tunjangan 20% dari gaji dasar
        return gajiDasar + tunjangan;
    }

    // Method protected agar subclass bisa mendapatkan gaji akhir
    protected double getGajiAkhir() {
        return hitungGajiAkhir();
    }

    // Method protected agar subclass bisa mendapatkan informasi dasar
    protected String getInfoDasar() {
        return "ID: " + id + "\nNama: " + nama;
    }

}
