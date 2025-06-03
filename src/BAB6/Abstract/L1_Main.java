/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.Abstract;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class L1_Main {
    public static void main(String[] args) {
        System.out.println("LUAS dan KELILING");
        L1_LayangLayang x = new L1_LayangLayang();
        System.out.println("------------------------------");
        System.out.println("Luas Layang-layang : " + x.luas() );
        System.out.println("Keliling Layang-layang : " + x.keliling());
        System.out.println("------------------------------");
        L1_JajarGenjang y = new L1_JajarGenjang();
        System.out.println("Luas Jajargenjang : " + y.luas());
        System.out.println("Keliling Jajargenjang : " + y.keliling());
    }
}

