/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPraktikum.BAB5;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Mahasiswa {
    String nim, nama, prodi, angktn, kelamin, alamat;
    void dataNIM(String Nim){
        this.nim = Nim;
    }    
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void dataProdi(String Prodi){
        this.prodi = Prodi;
    }
    void dataAngkatan(String Angktn){
        this.angktn = Angktn;
    }
    
    String cetakNIM(){
        return nim;
    }
    String cetakNama(){
        return nama;
    }
    String cetakProdi(){
        return prodi;
    }
    String cetakAngkatan(){
        return angktn;
    }
    void dataJenisKelamin(String jenis){
    this.kelamin = jenis;
    }
    String cetakJenisKelamin(){
        return kelamin;
    }
    void dataAlamat(String Alamat){
        this.alamat = Alamat;
    }
    String cetakAlamat(){
        return alamat;
    }
}

