/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Dao duc nha
 * @version 1.0
 * @since 9-2016
 */
public class MainCount {
    public static void main(String[] args) {
        CountThread[] ct = new CountThread[10];
        
        for (int i = 0; i < ct.length; i++) {
            ct[i] = new CountThread( "Thread"+i);
            ct[i].start();
        }
    }
}
