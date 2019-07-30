package Bai03;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    static Scanner scan = new Scanner(System.in);
    //static ArrayList<PhuongTienGT> list = new ArrayList<>();

    public static void main(String[] args) {
        int chon, chon1;
        do {
            PhuongTienGT ptgt = new PhuongTienGT();
            System.out.print("1.Nhap thong tin.\n2.Xuat thong tin.\n3.Thoat\nBan chon:");
            chon = scan.nextInt();
            switch (chon) {
                case 1:
//                    System.out.print("So luong phuong tien: ");
//                    int sl = scan.nextInt();
//                    for (int i = 0; i < sl; i++) {
                        ptgt.nhapDuLieu();
//                        list.add(ptgt);
//                    }
                    break;
                case 2:
                    System.out.printf("%-20s%-20s%-15s%-15s%-15s\n", "Chu Xe", "Hang Xe", "Gia Tri", "Dung Tich", "Thue");
                    System.out.println(ptgt.toString());
//                    for(int i = 0; i < list.size(); i++){
//                        System.out.println(list.get(i).toString());
//                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            System.out.print("Nhap 1 de tiep tuc: ");
            chon1 = scan.nextInt();
        } while (chon1 == 1);
    }
}
