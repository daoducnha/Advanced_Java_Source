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
public class CountThread extends Thread{
    static int count = 0;

    String nameThread;
    public CountThread(String nameThread) {
        
        this.nameThread = nameThread;
    }

    

    public String getNameThread() {
        return nameThread;
    }

    public void setNameThread(String nameThread) {
        this.nameThread = nameThread;
    }
    
    
    public int nextCount(){
        synchronized (this){
            return count++;
        }
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread :"+this.nameThread+" count: "+this.nextCount());
        }
        
    }
}
