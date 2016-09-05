/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task28Observer;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class Account {
    private List<Observer> observers = new ArrayList<>();
    private double state;
    
    public double getState(){
        return state;
    }
    public void setState(double state){
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }    

    
}
