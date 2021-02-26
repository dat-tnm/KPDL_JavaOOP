/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.donglenh.chuong01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class xuatnhap {
    public static void main(String[] args){
        boolean flag = true;
        int a = 15;
        byte b = 2;
        double c = 12.6;
        float d = 4.5f;
        String e = "hello kitty";
        char ch = 'a';
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.println("Ban da nhap ho ten la: " + hoten);
        
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a = Integer.parseInt(input);
        System.out.println("Ban da nhap so nguyen la: " + a);
        
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input2 = sc.nextLine();
        c = Double.parseDouble(input2);
        System.out.println("Ban da nhap so nguyen la: " + c);

    }
}
