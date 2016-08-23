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
public class Fish extends Animal implements ISwimming, IWater, IGrowing{

    public Fish(String name, String food) {
        super(name, food);
    }

    @Override
    public void swimming() {
        System.out.println("Swimming");
    }

    @Override
    public void water() {
        System.out.println("Live in water");
    }

    @Override
    public void growing() {
        System.out.println("Not molt");
    }
    
    public void outputInfo(){
        System.out.println("Name: "+name+" - Food: "+food);
        swimming();        
        growing();
        water();
    }
}
