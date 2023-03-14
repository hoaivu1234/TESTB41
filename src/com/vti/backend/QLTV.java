package com.vti.backend;
import com.vti.entity.inheritance.QS_4.TaiLieu;
import com.vti.entity.inheritance.QS_4.Bao;
import com.vti.entity.inheritance.QS_4.Sach;
import com.vti.entity.inheritance.QS_4.TapChi;
import java.util.ArrayList;
import java.util.Scanner;

public class QLTV {
    private ArrayList<TaiLieu> tl;

    public QLTV() {
        tl = new ArrayList<>();
    }

    // them tai lieu
    Scanner sc = new Scanner(System.in);

    public void addTaiLieu() {

        int n;

        System.out.println("Nhap so tai lieu muon them: ");
        n = sc.nextInt();
        int choose;
        TaiLieu taiLieu = new TaiLieu();
        for (int i = 0; i < n; i++) {
            System.out.println("1: Sach || 2:Tap chi || 3:Bao");
            choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    taiLieu = new Sach();
                    break;
                }
                case 2: {
                    taiLieu = new TapChi();
                    break;
                }
                case 3: {
                    taiLieu = new Bao();
                    break;
                }
                default: {
                    System.out.println("nhap sai!!!");
                    break;
                }
            }
            taiLieu.input();
            tl.add(taiLieu);

        }
    }

    //xoa tai lieu
    public void deleteTaiLieu() {
        int tailieu;
        System.out.println("Nhap ma tai lieu muon xoa: ");
        tailieu = sc.nextInt();
        for(TaiLieu tll:tl){
            if(tailieu==tll.getMaTL()){
                tl.remove(tll);
            }
        }
    }
    //Hien thi thong tin tl
    public void printTaiLieu(){
        for(TaiLieu tll:tl){
            tll.getInfor();
        }
    }

    // TIm kiem theo loai:
    public void findTaiLieu(){
        int n;
        System.out.println("Chon loai tai lieu: 1:Sach || 2:Tap chi || 3:Bao");
        n=sc.nextInt();
        switch (n){
            case 1:{
                for(TaiLieu tll:tl){
                    if(tll instanceof Sach){
                        tll.getInfor();
                    }
                }
                break;
            }
            case 2:{
                for(TaiLieu tll:tl){
                    if(tll instanceof TapChi){
                        tll.getInfor();
                    }
                }
                break;
            }
            case 3:{
                for(TaiLieu tll:tl){
                    if(tll instanceof Bao){
                        tll.getInfor();
                    }
                }
                break;
            }
            default:
                System.out.println("Nhap sai!!!");
                break;

        }
    }

}