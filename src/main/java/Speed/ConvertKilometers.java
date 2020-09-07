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
public class ConvertKilometers extends PhepToan {
    public ConvertKilometers() {
        super();
    }
    public ConvertKilometers(double a) {
        super(a);
    }
    
    public double Calculation() {
        return super.getA() * 3.6;
    }
    
    public String toString() {
        return super.getA() + " m/s = " + Calculation() + " km/h";
    }
}
