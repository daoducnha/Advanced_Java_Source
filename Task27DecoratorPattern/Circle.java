/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27DecoratorPattern;

/**
 *
 * @author Dao Duc Nha
 * date 9/5/2016
 * @version 1.0
 * Class Circle implemnet shape
 */
public class Circle implements Shape{

    @Override
    public String draw() {
        return "Shape:Circle";
    }
    
}
