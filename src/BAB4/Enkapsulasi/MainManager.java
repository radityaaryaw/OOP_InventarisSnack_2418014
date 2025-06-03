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
public class MainManager {
    public static void main(String[] args) {
// Membuat objek Manager
        l1_Manager mgr = new l1_Manager(25000000, "Teknologi Informasi");
        // Mengatur Nama dan ID menggunakan setter
        mgr.setNama("Ahmad Santoso");
        mgr.setId("ID-MGR-001");

        // Menampilkan informasi
        mgr.tampilkanInfo();
    }
}

