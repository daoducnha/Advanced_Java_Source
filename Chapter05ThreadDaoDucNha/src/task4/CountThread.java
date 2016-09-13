/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hv
 */
public class CountThread extends Thread {

    String threadName;
    PrintCount pc;
    int count = 0;

    public CountThread(String threadName, PrintCount pc) {
        this.threadName = threadName;
        this.pc = pc;
    }

    
    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread: " + threadName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
    }

}
