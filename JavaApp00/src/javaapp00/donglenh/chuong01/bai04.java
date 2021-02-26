/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.donglenh.chuong01;

/**
 *
 * @author Admin
 */
public class bai04 {
    public static void main(String[] args){
        Circle htron = new Circle(5, 1, 2);
        System.out.println("Chu vi hinh tron =" + htron.calcPerimeter());
        System.out.println("Dien tich hinh tron =" + htron.calcArea());

        Rectangle hcn = new Rectangle(3, 15, 8, 5);
        System.out.println("Chu vi hinh cn =" + hcn.calcPerimeter());
        System.out.println("Dien tich hinh cn =" + hcn.calcArea());
    }
}
