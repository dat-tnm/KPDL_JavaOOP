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
public class bai05 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);
        Date currentDate = new Date();
        String output = df.format(currentDate);
        System.out.println(output);
        
        String input = "15-05-1995";
        Date ngay = df.parse(input);
        System.out.println(ngay);
        System.out.println(df.format(ngay));
    }
}
