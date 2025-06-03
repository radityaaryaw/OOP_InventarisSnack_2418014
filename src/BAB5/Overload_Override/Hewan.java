/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB5.Overload_Override;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Hewan {
    public Hewan(){
        System.out.println("Konstruktor Class Hewan");
    }
    public void makan(){   // method dasar
        System.out.println("Penggolongan jenis makanan hewan yaitu :\n" +
                "1. Herbivora : hewan pemakan tumbuhan.\n" +
                "2. Karnivora : hewan pemekan daging\n" +
                "3. Omnivora : hewan pemakan tumbuhan dan daging.");
    }

}
