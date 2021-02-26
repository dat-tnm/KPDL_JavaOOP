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
public class Rectangle {
    private int upper_x, upper_y, lower_x, lower_y;
    
    public Rectangle(){}

    public Rectangle(int upper_x, int upper_y, int lower_x, int lower_y) {
        this.upper_x = upper_x;
        this.upper_y = upper_y;
        this.lower_x = lower_x;
        this.lower_y = lower_y;
    }
    
    public double calcPerimeter(){
        return 2*(Math.abs(upper_x - lower_x) + Math.abs(upper_y - lower_y));
    }
    
    public double calcArea(){
        return Math.abs((upper_x - lower_x)*(upper_y - lower_y));
    }
    
    
}
