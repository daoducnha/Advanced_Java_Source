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
public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    public ThreadDemo() {
    }

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);

    }

    @Override
    public void run() {
        System.out.println("Runing " + threadName);
        try {
            for (int i = 3; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + threadName + " interrupted.");
        }
        System.out.println("Thread: " + threadName + " exitting.");
    }
    
    @Override
    public void start(){
        System.out.println("Starting "+threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
