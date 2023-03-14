package com.vti.frontend;
import com.vti.backend.QLCB;
import com.vti.backend.QLTV;

import java.util.Scanner;

public class InheritanceProgram {
    public static void main(String[] args) {

        //question1_2();
        Qs4();

    }

    private static void menuQuesion1_2() {
        System.out.println("=======MENU==========");
        System.out.println("==  1. Thêm cán bộ ==");
        System.out.println("==  2. Hiện cán bộ ==");
        System.out.println("==  3. Tìm cán bộ  ==");
        System.out.println("==  4. Xóa cán bộ  ==");
        System.out.println("==  0. Thoát       ==");
        System.out.println("=====================");
    }
    private static void menuQS4(){
        System.out.println("========MENU=========");
        System.out.println("== 1.Them tai lieu ==");
        System.out.println("== 2.Xoa tai lieu ===");
        System.out.println("== 3.In tai lieu ====");
        System.out.println("== 4.Tim kieu tl ====");
        System.out.println("== 5.Thoat ==========");
        System.out.println("=====================");
    }

    public static void question1_2() {
        QLCB qlcb = new QLCB();

        byte choose;
        do {
            Scanner scanner = new Scanner(System.in);
            menuQuesion1_2();
            choose = scanner.nextByte();

            switch (choose) {
                case 1:
                    qlcb.addCanBo();
                    break;
                case 2:
                    qlcb.printInforCanBo();
                    break;
                case 3:
                    qlcb.findCanBo();
                    break;
                case 4:
                    qlcb.deleteCanBo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhập sai ! Nhập lại !");
                    break;
            }
        } while (choose != 0);

    }
    public static void Qs4(){
        int choose;
        QLTV qltv=new QLTV();
        Scanner sc=new Scanner(System.in);
        do{
            menuQS4();
            System.out.println("Chon cn: ");
            choose=sc.nextInt();
            switch (choose){
                case 1:{
                    qltv.addTaiLieu();
                    break;
                }
                case 2:
                    qltv.deleteTaiLieu();
                    break;
                case 3:
                    qltv.printTaiLieu();
                    break;
                case 4:
                    qltv.findTaiLieu();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Nhap sai!!!");
                    break;
            }


        }while(choose!=5);
    }
}
