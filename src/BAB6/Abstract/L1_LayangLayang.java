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
public class L1_LayangLayang extends L1_BangunDatarSegiEmpat{
    int d1, d2, a, b;
    public L1_LayangLayang(){
        this.d1 = 5;
        this.d2 = 6;
        this.a = 12;
        this.b = 35;
    }
    @Override
    double luas() {
        return (0.5* d1*d2);
    }

    @Override
    double keliling() {
        return (2*(a+b));
    }
    
}

