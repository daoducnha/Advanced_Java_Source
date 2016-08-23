/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_17;

/**
 *
 * @author hv
 */
public class Bird extends Animal implements IFlying, IRunning, IGrowing, INest{

    public Bird(String name, String food) {
        super(name, food);
    }

    @Override
    public void flying() {
        System.out.println("Flying");
    }

    @Override
    public void running() {
        System.out.println("Runing");
    }

    @Override
    public void growing() {
        System.out.println("Not Molting");
    }

    @Override
    public void nesting() {
        System.out.println("Live in Nest");
    }
    
    public void outputInfo(){
        System.out.println("Name: "+name+" - Food: "+food);
        flying();
        running();
        growing();
        nesting();
    }
    
}
