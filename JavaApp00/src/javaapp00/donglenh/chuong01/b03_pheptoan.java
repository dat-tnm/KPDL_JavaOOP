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
public class b03_pheptoan {
    public static void main(String[] args){
        int a = 17, b = 4, c;
        c = a + b;
        System.out.println("Phep cong "+a+" + "+b+" = "+c);
        c = a - b;
        System.out.println("Phep tru "+a+" - "+b+" = "+c);
        c = a * b;
        System.out.println("Phep nhan "+a+" * "+b+" = "+c);
        c = a / b;
        System.out.println("Phep chia lay phan nguyen "+a+" / "+b+" = "+c);
        c = a % b;
        System.out.println("Phep chia lay phan du "+a+" % "+b+" = "+c);
        
        //phep toan so thuc
        double x = 14.3, y = 3.56, z;
        z = x + y;
        System.out.println("Phep cong "+x+" + "+y+" = "+z);
        z = x - y;
        System.out.println("Phep tru "+x+" - "+y+" = "+z);
        z = x * y;
        System.out.println("Phep nhan "+x+" * "+y+" = "+z);
        z = x / y;
        System.out.println("Phep chia "+x+" / "+y+" = "+z);
        
        //phep toan kieu logic
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("Phep AND "+ (flag1 && flag2));
        System.out.println("Phep OR "+ (flag1 || flag2));
        System.out.println("Phep NOT "+ (!flag1));
        System.out.println("Phep AND "+ (flag1^flag2));
        
        //mot so phep co ban tren chuoi
        String s1 = "Hue University";
        String s2 = "university";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase().contains(s2));
        s1 += " " + s2;
        System.out.println(s1);

    }
}
