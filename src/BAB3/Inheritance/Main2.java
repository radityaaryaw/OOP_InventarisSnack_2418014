/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritance;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Main2 {
    public static void main(String[] args) {
      Lingkaran lkr = new Lingkaran(); // memanggil constructor
      
      lkr.Deskripsi();
      System.out.println("Hasilnya adalah :"+lkr.luas());
      
      Tabung tbg = new Tabung();
      tbg.Keterangan();
     
      System.out.println(" volumenya adalah :" +tbg.volume());
      
       } 
}
