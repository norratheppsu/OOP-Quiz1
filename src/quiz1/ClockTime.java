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
public class ClockTime {
    private int hour;
    private int minute;
    private int second;
    
    public ClockTime() {
        this(1,1,1);
        
        // OR:
        // hour = 1; 
        // minute = 1; 
        // second = 1;
    }
    
    public ClockTime(int h, int m, int s) {
        hour = h; 
        minute = m; 
        second = s;
    }
    
    public void setHour(int h){
        if(h >= 0 && h <= 23) {
            hour = h;
        }
    }
    
    public void setMinute(int m){
        if(m >= 0 && m <= 59) {
            minute = m;
        }
    }
    
    public void reset() {
        hour = 0; 
        minute = 0; 
        second = 0;
    }
    
    public void displayTime() {
        String out = hour+":"+minute+":"+second;
        System.out.println(out);
    }
    
}
