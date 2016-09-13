/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author hv
 */
public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo("Google");
        t1.start();
        
        ThreadDemo t2 = new ThreadDemo("Yahoo");
        t2.start();
        
        ThreadDemo t3 = new ThreadDemo("Facebook");
        t3.start();
    }
}
