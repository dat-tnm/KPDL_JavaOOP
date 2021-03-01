/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong03.donglenh;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test2DArray {
    public static void main(String[] args){
        int[][] matran = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
//        Scanner sc = new Scanner(System.in);
//        
//        matran = new int[5][7];
//        Random rnd = new Random();
//        for (int i = 0; i < matran.length; i++) {
//            for (int j = 0; j < matran[1].length; j++) {
//                //matran[i][j] = rnd.nextInt(1000);
//                System.out.print("a["+i+"]["+j+"]");
//                matran[i][j] = Integer.parseInt(sc.nextLine());
//            }
//        }
        
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[1].length; j++) {
                System.out.print(matran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
