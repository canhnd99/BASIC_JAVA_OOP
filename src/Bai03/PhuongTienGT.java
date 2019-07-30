package Bai03;

import java.util.Scanner;

public class PhuongTienGT {

    Scanner scan = new Scanner(System.in);
    private String chuXe;
    private String hangXe;
    private double giaTri;
    private int dungTich;

    public PhuongTienGT() {
    }

    public PhuongTienGT(String chuXe, String hangXe, double giaTri, int dungTich) {
        this.chuXe = chuXe;
        this.hangXe = hangXe;
        this.giaTri = giaTri;
        this.dungTich = dungTich;
    }

    public String getChuXe() {
        return chuXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void nhapDuLieu() {
        System.out.print("Ten chu xe: ");
        this.chuXe = scan.nextLine();
        System.out.print("Ten hang xe: ");
        this.hangXe = scan.nextLine();
        System.out.print("Gia tri xe: ");
        this.giaTri = scan.nextDouble();
        System.out.print("Dung tich xe: ");
        this.dungTich = scan.nextInt();
    }

    public double tinhThue() {
        double gtri = getGiaTri();
        double dt = getDungTich();
        if (dt < 100) {
            return gtri / 100;
        } else if (dt >= 100 && dt <= 200) {
            return gtri / 100 * 3;
        } else {
            return gtri / 100 * 5;
        }
    }

    @Override
    public String toString() {
        String cx = getChuXe();
        String hx = getHangXe();
        double gt = getGiaTri();
        int dt = getDungTich();
        double thue = tinhThue();

        String res = String.format("%-20s%-20s%-15.3f%-15d%-15.3f\n", cx, hx, gt, dt, thue);

        return res;
    }

}
