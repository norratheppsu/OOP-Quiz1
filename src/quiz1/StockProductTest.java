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
public class StockProductTest {
    public static void main(String[] args) {
        StockProduct sp = new StockProduct("Medicine", 10);
        System.out.println(sp.getName());
        System.out.println(sp.getNumProducts());
        sp.addProduct(-10);
        System.out.println(sp.getNumProducts());
        sp.addProduct(10);
        System.out.println(sp.getNumProducts());
    }
    
}
