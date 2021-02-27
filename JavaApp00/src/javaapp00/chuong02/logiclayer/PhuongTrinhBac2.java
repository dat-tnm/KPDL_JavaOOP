/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp00.chuong02.logiclayer;

/**
 *
 * @author Admin
 */
public class PhuongTrinhBac2 implements IGiaiPhuongTrinh {
    private double a, b, c;
    private double x1, x2;
    private String ketqua;
    
    public PhuongTrinhBac2(){
    }

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void giaiPhuongTrinh() {
        if (a == 0) {
            PhuongTrinhBac1 ptb1 = new PhuongTrinhBac1(b, c);
            ptb1.giaiPhuongTrinh();
            ketqua = ptb1.getKetqua();
        }
        else {
            double delta = b*b + 4*a*c;
            if (delta < 0) 
                ketqua = "Phuong trinh bac 2 vo nghiem: ";
            else if (delta == 0) {
                x1 = -b/(2*a);
                x2 = x1;
                ketqua = "Phuong trinh bac 2 co nghiem kep la: " + x1;
            }
            else {
                x1 = (-b + Math.sqrt(delta)) / (2*a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                ketqua = "Phuong trinh co 2 nghiem phan biet: x1="+x1 + " x2="+x2;
            }
        }
    }

    @Override
    public String toString() {
        if (ketqua == null || ketqua.isEmpty()) {
            giaiPhuongTrinh();
        }
        return ketqua;
    }

    public String getKetqua() {
        return ketqua;
    }
    
}
