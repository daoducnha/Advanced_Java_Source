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
public class Boa extends Animal implements ISwimming, IRunning, IGrowing, INest{

    public Boa(String name, String food) {
        super(name, food);
    }

    @Override
    public void swimming() {
        System.out.println("Swimming");
    }

    @Override
    public void running() {
        System.out.println("Running");
    }

    @Override
    public void growing() {
        System.out.println("Molting");
    }

    @Override
    public void nesting() {
        System.out.println("Live in Nest");
    }
    
    public void outputInfo(){
        System.out.println("Name: "+name+" - Food: "+food);
        swimming();
        running();
        growing();
        nesting();
    }
}
