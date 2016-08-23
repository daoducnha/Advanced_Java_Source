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
public class Tiger extends Animal implements IRunning, ISwimming, IGrowing, IBurrow{

    public Tiger(String name, String food) {
        super(name, food);
    }

    @Override
    public void running() {
        System.out.println("Running");
    }

    @Override
    public void swimming() {
        System.out.println("Swiming");
    }

    @Override
    public void growing() {
        System.out.println("Not molt");
    }

    @Override
    public void burrow() {
        System.out.println("Live ing Nest");
    }
    
    public void outputInfo(){
        System.out.println("Name: "+name+" - Food: "+food);
        swimming();
        running();
        growing();
        burrow();
    }
    
}
