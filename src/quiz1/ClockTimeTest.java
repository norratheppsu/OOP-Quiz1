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
public class ClockTimeTest {
    public static void main(String[] args) {
        ClockTime ct = new ClockTime();
        ct.displayTime();
        ct.setHour(23);
        ct.displayTime();
        ct = new ClockTime(10,12,55);
        ct.displayTime();
        ct.setMinute(0);
        ct.displayTime();
        ct.reset();
        ct.displayTime();
    }
}
