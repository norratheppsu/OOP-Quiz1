/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author super
 */
public class StockProduct {
    private String name ;
    private int numProducts ;
    
    public StockProduct ( String name , int numProducts ) {
        // Implement this
        this.name = name;
        if(numProducts < 0) {
            this.numProducts = 0;
        }
        else {
            this.numProducts = numProducts;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumProducts() {
        return this.numProducts;
    }
    
    public void addProduct (int num ) {
        if(num > 0) {
            numProducts = numProducts+num;
        }
    }
    
}
