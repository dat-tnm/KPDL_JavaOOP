/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong04.donglenh;

import javaapp00.chuong04.logic.FibonacciNumber;

/**
 *
 * @author Admin
 */
public class testFibonacci {
    public static void main(String[] args){
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println("So Fibonacci tai vi tri n = 15 la: " + fn.calcFibo(15));
        for (int i = 0; i < 20; i++) {
            System.out.print(fn.calcFibo(i)+", ");
        }
    }
}
