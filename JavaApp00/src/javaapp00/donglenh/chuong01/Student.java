/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.donglenh.chuong01;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements TaxInterface {
    private String truonghoc;
    
    public Student(){
    }
    
    public Student(String hoten, int gioitinh, Date ngaysinh, String truonghoc) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcTax(double income) {
        return 0.01*income;
    }
    
    
}
