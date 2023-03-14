package com.vti.entity.inheritance.QS_4;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;
    public int getSoPH(){return soPH;}
    public int getThangPH(){return thangPH;}

    public void input(){
        super.input();
        System.out.println("Nhap so phat hanh: ");
        Scanner sc=new Scanner(System.in);
        soPH=sc.nextInt();
        System.out.println("Nhap thang phat hanh: ");
        thangPH=sc.nextInt();
    }
    public void getInfor(){
        super.getInfor();
        System.out.println("So phat hanh:   "+soPH);
        System.out.println("Thang phat hanh: "+thangPH);
    }
}
