package com.vti.entity.inheritance.QS_4;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private int ngayPH;
    public int getNgayPH(){return ngayPH;}

    public void input(){
        super.input();
        System.out.println("Nhap ngay phat hanh: ");
        Scanner sc=new Scanner(System.in);
        ngayPH=sc.nextInt();
    }
    public void getInfor(){
        super.getInfor();
        System.out.println("Ngay phat hanh: "+ngayPH);
    }
}
