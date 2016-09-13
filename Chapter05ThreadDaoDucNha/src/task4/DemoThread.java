/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author hv
 */
public class DemoThread {

    int count = 0;

    

    public static void main(String[] args) {
        DemoThread d = new DemoThread();

        CountThread[] arrayThread = new CountThread[10];
        
        for (int i = 0; i < 10; i++) {
           // arrayThread[i] = new CountThread("Thread"+i, );
            arrayThread[i].start();   
            try {
            arrayThread[i].join();
        } catch (Exception e) {
        }
        }
        
        
    }
}
