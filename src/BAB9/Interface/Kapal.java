/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Interface;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Kapal extends Kendaraan implements Berjalan {
    public Kapal(String merek) {
        super(merek);
    };

    @Override
    void carabergerak() {
        System.out.println("Kapal " + merek + " bergerak di ");
    }

    @Override
    void kecepatanMax() {
        System.out.println("kapal ini memiliki kecepatan max yaitu 350 km/jam"); 
    }

    @Override
    public void berjalan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
