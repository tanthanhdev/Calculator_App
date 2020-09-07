/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Length;

import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class QuanLyPhepToanLength {
    private ArrayList<PhepToan> arr = new ArrayList<PhepToan>();
    
    public void add(PhepToan x) {
        arr.add(x);
    }
    
    public void remove(int i) {
        arr.remove(i);
    }
    
    public PhepToan get(int i) {
        return arr.get(i);
    }
    
    public int size() {
        return arr.size();
    }
}
