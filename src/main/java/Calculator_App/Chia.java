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
public class Chia extends PhepToan {
    
    public Chia() {
        super();
    }
    
    public Chia(double a, double b) {
        super(a, b);
    }
    
    public double Calculation() {
        return super.getA() / super.getB();
    }
    
    public String toString() {
        return super.getA() + " / " + super.getB() + " = " + Calculation(); 
    }
}
