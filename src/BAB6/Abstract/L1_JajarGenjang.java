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
public class L1_JajarGenjang extends L1_BangunDatarSegiEmpat{
    double a,t,b;
    public L1_JajarGenjang(){
        this.a = 8;
        this.t = 3;
        this.b = 9;
    }
    @Override
    double luas() {
        return (a*t);
    }

    @Override
    double keliling() {
        return (2*(a+b));
    } 
}
