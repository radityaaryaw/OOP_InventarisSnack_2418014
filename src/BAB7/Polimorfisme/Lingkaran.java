/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme;

/**
 *
 * @author Raditya Arya Wiguna
 */
public class Lingkaran extends BangunDatar{
    private double jariJari;
    double phi = 3.14;

    public Lingkaran(int jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        return phi * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * phi * jariJari;
    }  }

