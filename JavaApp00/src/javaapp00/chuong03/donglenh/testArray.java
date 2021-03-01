/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong03.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class testArray {
    public static void main(String[] args){
//        int[] a = new int[4];
//        a[0] = 12;
//        a[1] = 9;
//        a[2] = 1;
//        a[3] = 15;
//        
//        System.out.println(Arrays.toString(a));
//        
//        int[] b = new int[]{1, 2 , -7, 8, 9 , 20};
//        System.out.println(Arrays.toString(b));
//        System.out.println("So phan tu cua mang b: "+b.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] c = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("c[" + i + "] = ");
//            c[i] = Integer.parseInt(sc.nextLine());
//        }
//        System.out.println("Gia tri cua mang vua nhap la:");
//        System.out.println(Arrays.toString(c));
//        for (int i = 0; i < c.length; i++) {
//            System.out.print(c[i] + " ");
//        }
        
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            c[i] = rnd.nextInt(1000);
        }
        System.out.println(Arrays.toString(c));
        
//        int temp;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (c[i] > c[j]) {
//                    temp = c[i];
//                    c[i] = c[j];
//                    c[j] = temp;
//                }
//            }
//        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
