package com.vti.entity.inheritance.QS_4;
import java.util.Scanner;

public class TaiLieu {
    private int maTL;
    private String tenNXB;
    private int soBanPH;
    public TaiLieu(){

    }
    public int getMaTL() {return maTL;}
    public String getTenNXB(){return tenNXB;}
    public int getSoBanPH() {return soBanPH;}

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma tai lieu: ");
        maTL=sc.nextInt();
        System.out.println("Nhap ten nha xuat ban: ");
        sc.nextLine();
        tenNXB=sc.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        soBanPH=sc.nextInt();
    }
    public void getInfor(){
        System.out.println("Ma tai lieu:  "+maTL);
        System.out.println("Ten nha xb:   "+tenNXB);
        System.out.println("So ban PH:    "+soBanPH);
    }

}
