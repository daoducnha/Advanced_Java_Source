/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_16;


/**
 *
 * @author Dao Duc Nha
 * @date 23/8/2016
 * @version 1.0
 * Class absstract for Means of transport
 */
public abstract class MeansOfTransport {
   double distance;
   double time;
   double fuel;
   String id;
   String color;
   String Publisher;
   
   //method for calculater velocity
   abstract double calVelocity();
   //method for calculater consume
   abstract double calConsume();

}
