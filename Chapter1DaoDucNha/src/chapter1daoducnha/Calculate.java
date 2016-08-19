/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1daoducnha;

public class Calculate {

    int num1;
    int num2;

    public Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculate() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //addition, output = num1+num2
    public int addition() {
        return num1 + num2;
    }

    //subtraction, output = num1 - num2

    public int subtraction() {
        return num1 - num2;
    }

    //multiplication, output num1 * num2

    public int multiplication() {
        return num1 * num2;
    }

    //division output  num1/num2 if num2 == 0 output Error /by zero

    public double division() throws ArithmeticException{
        double rs = 0.0;
        try{
        rs = (double)num1 / (double)num2;
        return rs;
        }catch(ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return rs;
    }
}
