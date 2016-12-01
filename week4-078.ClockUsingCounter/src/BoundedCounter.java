/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chan
 */
public class BoundedCounter {
    private int value;
    private int upperLimit; 
    
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 00;
    }
    
    public void next() {
        if (this.value < upperLimit) {
            this.value++;
        } else {
            this.value = 00;
        }
    }
    
    public int getValue() {
    // write here code that returns the value
        return this.value;
    }
    
    public void setValue(int value) {
        if (value < 0) {
        
        } else if (value > this.upperLimit) {
            
        } else {
            this.value = value;
        }
    }
    
    public String toString() {
        return String.format( "%02d", this.value); 
    }
}
