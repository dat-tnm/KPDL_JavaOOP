/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong03.coffeelogic;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Bill implements Cloneable {
    private int billID;
    private Product[] products;

    public Bill() {
    }

    public Bill(int billID, Product[] products) {
        this.billID = billID;
        this.products = products;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        String s = "Bill " + billID + "\n";
        for (Product product : products) {
            s += "\t " + product.toString() + "\n";
        }
        return s;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bill temp = (Bill)super.clone();
        temp.setBillID(this.billID);
        temp.setProducts(new Product[this.products.length]);
        for (int i = 0; i < this.products.length; i++) {
            temp.products[i] = new Product(this.products[i].getName(), 
                    this.products[i].getPrice());
        }
        return temp;
    }
    
    
    
    
}
