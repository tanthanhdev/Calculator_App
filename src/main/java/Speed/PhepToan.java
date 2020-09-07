/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Speed;

/**
 *
 * @author thanh
 */
public abstract class PhepToan {
    private double a;
    public PhepToan() {
        a = 0;
    }
    public PhepToan(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public abstract double Calculation();

}
