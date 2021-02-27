/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        Date ngaysinh = df.parse("11-03-2001");
        Person person = new Person("Nguyen Van A", 1, ngaysinh);
        
        System.out.println("Hoten: " + person.getHoten() + ",Ngaysinh: " + df.format(person.getNgaysinh())
                + ",Gioi tinh: " + person.getGioitinh());
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-02-2002"));
        sinhvien.setTruonghoc("dai hoc hue");
        
        System.out.println("Hoten: " + sinhvien.getHoten() + ",Ngaysinh: " + df.format(sinhvien.getNgaysinh())
                + ",Gioitinh: " + sinhvien.getGioitinh() + ",Truonghoc :" + sinhvien.getTruonghoc());
    
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-29-2003"));
        congnhan.setCongty("IBM");
    
        System.out.println("Hoten: " + congnhan.getHoten() + ",Ngaysinh: " + df.format(congnhan.getNgaysinh())
                + ",Gioitinh: " + congnhan.getGioitinh() + ",Congty :" + congnhan.getCongty());
    
    }
}
