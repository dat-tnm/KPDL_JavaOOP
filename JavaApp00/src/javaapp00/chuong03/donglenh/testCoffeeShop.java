/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong03.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import javaapp00.chuong03.coffeelogic.CoffeeShop;
import javaapp00.chuong03.coffeelogic.Manager;

/**
 *
 * @author Admin
 */
public class testCoffeeShop {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 nguyen hue"),
            new CoffeeShop("White garden", "4 nguyen hue"),
            new CoffeeShop("Gia Dinh", "3 nguyen hue")
        };
        Manager[] managers = new Manager[]{
            new Manager(a, 1200, "Nguyen Van A", 1, df.parse("12-12-1999")),
            new Manager(new CoffeeShop[]{new CoffeeShop("Hong That Cong", "18 nguyen hue")}
                    , 1000, "Le Thi B", 1, df.parse("12-12-1999"))
        };
        System.out.println(Arrays.toString(managers));
    }
}
