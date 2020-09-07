/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Length;

/**
 *
 * @author thanh
 */
public class ConvertCentimeters extends PhepToan {
    public ConvertCentimeters() {
        super();
    }
    
    public ConvertCentimeters(double a) {
        super(a);
    }
    
    public double Calculation() {
        return super.getA() * 100;
    }
    
    public String toString() {
        return super.getA() + " m = " + Calculation() + " cm";
    }
}
