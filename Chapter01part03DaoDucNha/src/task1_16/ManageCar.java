/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16;

import java.io.IOException;

/**
 *
 * @author hv
 */
public interface ManageCar {
    boolean addCar(Car c);    
    Car inputInfoCar(double distance,double time,double fuel,String id,String color,String Publisher)throws IOException;
    void outputArrCar();    
}