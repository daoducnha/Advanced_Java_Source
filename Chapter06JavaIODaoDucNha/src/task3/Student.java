/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 9/2016
 */
public class Student {
    String nama;
    int blockClass;
    double mark1, mark2;

    public Student() {
    }

    public Student(String nama, int blockClass, double mark1, double mark2) {
        this.nama = nama;
        this.blockClass = blockClass;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBlockClass() {
        return blockClass;
    }

    public void setBlockClass(int blockClass) {
        this.blockClass = blockClass;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }
    
    public double calAVG(){
        return (mark1+mark2)/2;
    }

    @Override
    public String toString() {
        return nama+"\t"+blockClass+"\t"+mark1+"\t"+mark2+"\t"+this.calAVG();
    }
            
    
}
