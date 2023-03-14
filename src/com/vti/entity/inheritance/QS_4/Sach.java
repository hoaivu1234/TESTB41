package com.vti.entity.inheritance.QS_4;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTG;
    private int soTrang;

    public String getTenTG(){return tenTG;}
    public int getSoTrang(){return soTrang;}

    public void input(){
        super.input();
        System.out.println("Nhap ten tac gia: ");
        Scanner sc=new Scanner(System.in);
        tenTG=sc.nextLine();
        System.out.println("Nhap so trang: ");
        soTrang=sc.nextInt();
    }

    public void getInfor(){
        super.getInfor();
        System.out.println("Ten tac gia:  "+tenTG);
        System.out.println("So trang   :  "+soTrang);

    }

}
