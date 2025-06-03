/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassObject;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Kendaraan {

    String nama, warna, merk; //atribut

    //method
    int jmlRoda(int jml){ 
        return jml;
    }

    void kendaraanMaju(){
        System.out.println("Berjalan Maju");
    }
    void kendaraanMundur(){
        System.out.println("Berjalan Mundur");
    }
    void kendaraanBerhenti(){
        System.out.println(" Kendaraan Berhenti");
    }
}

