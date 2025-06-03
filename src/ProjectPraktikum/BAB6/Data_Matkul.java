/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPraktikum.BAB6;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Data_Matkul extends Matkul {
    public Data_Matkul(String kode_mk, String nama_mk, String dosen_pengampu, int jml_sks) {
        this.kode_mk = kode_mk;
        this.nama_mk = nama_mk;
        this.dosen_pengampu = dosen_pengampu;
        this.jml_sks = jml_sks;
    }
    
    @Override
    void tampilData() {
        
    }
}
