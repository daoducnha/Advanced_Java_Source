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
 * Class RedShapeDecorator to set color border of shap
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    
    private String setRedBorder(Shape shape){
        return "Border Color: Red";
    }
    @Override
    public String draw(){
        return this.shape.draw()+"and"+setRedBorder(shape);
    }
}
