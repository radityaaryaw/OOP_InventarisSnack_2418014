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
public class Kucing extends Hewan{
    public Kucing(){
        super(); // memanggil konstruktor parent Class
        System.out.println("Konstruktor Class Kucing");
    }
    
    @Override
    public void makan(){  // overriding
        System.out.println("Kucing sedang makan...");
    }
    
    public void makan(String food){  // overloading
        System.out.println("Kucing makan : "+ food);
    }
}
