/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong02.employeelogic;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Student extends Person implements TaxInterface {
    private String truonghoc;
    private String hocluc;
    private double hocbong;
    
    public Student(){
    }
    
    public Student(String hoten, int gioitinh, Date ngaysinh, String truonghoc) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
    }

    public Student(String truonghoc, String hocluc, String hoten, int gioitinh, Date ngaysinh) {
        super(hoten, gioitinh, ngaysinh);
        this.truonghoc = truonghoc;
        this.hocluc = hocluc;
    }
    
    

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public double getHocbong() {
        return hocbong;
    }

    public void setHocbong(double hocbong) {
        this.hocbong = hocbong;
    }

    @Override
    public double calcTax(double income) {
        return 0.01*income;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" + "truonghoc=" + truonghoc + ", hocluc=" + hocluc + ", hocbong=" + hocbong + '}';
    }
    
    
}
