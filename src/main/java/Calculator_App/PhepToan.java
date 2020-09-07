/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator_App;

/**
 *
 * @author thanh
 */
public abstract class PhepToan {
    private double a, b;
    
    public PhepToan() {
        a = b = 0;
    }
    
    public PhepToan(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = b;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public abstract double Calculation();
}
