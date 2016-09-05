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
 * Abstract Class ShapeDecorator
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
    
    @Override
    public String draw(){
        return shape.draw();
    }
}
