/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong02.donglenh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testWhile {
    public static void main(String[] args){
        int n;
        int i;
        
        double s1 = 0;
        n = 100;
        i = 1;
        while (i <= n){
            s1 = s1 + (double)1/i;
            i++;
        }
        System.out.println("Tong thu nhat la: " + s1);
        
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.print("Nhap so nguyen duong le n = ");
            n = Integer.parseInt(sc.nextLine());
            if (n>0 && (n%2 != 0)) {
                flag = true;
            }
            //flag = (n>0 && (n%2 != 0)) ? true : false;
        }
        
        int s2 = 0;
        i = 1;
        //n = 99;
        while (i <= n){
            s2 += i;
            i += 2;
        }
        System.out.println("Tong thu hai la: "+ s2);
    }
}
