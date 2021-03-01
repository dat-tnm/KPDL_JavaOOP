/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong03.donglenh;

import java.util.Arrays;
import javaapp00.chuong03.coffeelogic.Product;
import javaapp00.chuong03.coffeelogic.ProductCompareByName;
import javaapp00.chuong03.coffeelogic.ProductCompareByPrice;

/**
 *
 * @author Admin
 */
public class testProductArrray {
    public static void main(String[] args){
        Product[] sp = new Product[]{
            new Product("Sunsilk", 12),
            new Product("Lifeboy", 11),
            new Product("HeadShoulder", 10),
            new Product("Expresso", 8),
            new Product("ThienLong", 5)
        };

        System.out.println("Mang ban dau la:");
        System.out.println(Arrays.toString(sp));
//        Product temp;
//        for (int i = 0; i < sp.length - 1; i++) {
//            for (int j = i + 1; j < sp.length; j++) {
//                if (sp[i].getPrice() > sp[j].getPrice()) {
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                }
//            }
//        }
        Arrays.sort(sp, new ProductCompareByPrice());
        System.out.println("Mang san pham sap xep tang dan theo gia:");
        System.out.println(Arrays.toString(sp));
        
        Arrays.sort(sp, new ProductCompareByName());
        System.out.println("Mang sp sap xep theo ten:");
        System.out.println(Arrays.toString(sp));
    }
}
