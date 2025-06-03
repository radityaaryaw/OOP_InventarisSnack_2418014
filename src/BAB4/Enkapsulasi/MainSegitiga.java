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
public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.tinggi = 8;
        segitiga.setAlas(5);
        System.out.println("Luas Segitiga = "+ Double.toString(segitiga.Luas()));
    }
}


