/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum.BAB4;

/**
 *
 * @author Raditya Arya Wiguna
 */

public class Keripik extends Snack {
    // Deklarasi atribut dengan encapsulation
    private String bahanUtama;
    private String varianBumbu;
    private int berat_snack;
    private int level_pedas;

    // Setter & getter untuk bahan utama
    public void setBahan(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }
    public String getBahan(){
        return bahanUtama;
    }
    
    // Setter & getter untuk varian bumbu
    public void setVarian(String varianBumbu) {
        this.varianBumbu = varianBumbu;
    }
    public String getVarian(){
        return varianBumbu;
    }
    
    // Setter & getter untuk berat snack
    public void setBerat(int berat_snack) {
        this.berat_snack = berat_snack;
    }
    public int getBerat(){
        return berat_snack;
    }

    // Setter & getter untuk level pedas
    public void setLevelPedas(int level_pedas) {
        this.level_pedas = level_pedas;
    }
    public int LevelPedas(){ 
        return level_pedas;
    }
}
