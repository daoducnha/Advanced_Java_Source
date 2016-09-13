/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import task2.*;

/**
 *
 * @author hv
 */
public class MaxThread extends Thread{
    private  int lo, hi;
    private int[] arr;
    private int max = 0;

    public MaxThread(int lo, int hi, int[] arr) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }
    
    @Override
    public void run(){
        for (int i = this.lo; i < this.hi; i++) {
            max = Math.max(arr[i], this.max);
        }
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getHi() {
        return hi;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }    
}
