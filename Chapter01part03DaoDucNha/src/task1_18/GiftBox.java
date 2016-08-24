/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_18;

/**
 *
 * @author hv
 */
public class GiftBox {

    public String shape;
    public String Color;
    final int price = 10000;

    public GiftBox(String shape, String Color) {
        this.shape = shape;
        this.Color = Color;
    }

    public GiftBox() {
    }

    

    class Gift {

        public String name;
        public double weight;
        public int FEE = 200;

        public Gift() {
        }

        public Gift(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        public double calFee() {
            return weight * FEE + GiftBox.this.price;
        }
    }
}
