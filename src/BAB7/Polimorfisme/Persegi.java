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
public class Persegi extends BangunDatar{
    private double sisi;
    public Persegi(double sisi) {
        this.sisi = sisi;
    } 
    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
    @Override
    double hitungKeliling() {
        return 4 * sisi;
    } }

