/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong02.donglenh;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class testFor {
    public static void main(String[] args){
        int n = 100;
        double s = 0;
        for (double i = 1; i <= n; i++) {
            //s += (double)1/i;
            s += 1/i;
        }
        System.out.println("Tong thu nhat la: "+s);
        
        n = 99;
        int s2=0;
        for (int i = 1; i <= n; i+= 2) {
            s2 += i;
        }
        System.out.println("Tong thu hai la: "+s2);

        Random rnd = new Random();
        int x;
        for (int i = 0; i < 10; i++) {
            x = rnd.nextInt(101);
            System.out.println(x);
        }
    }
}
