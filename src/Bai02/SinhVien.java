package Bai02;

import java.util.Scanner;

public class SinhVien {

    Scanner scan = new Scanner(System.in);
    private int ma;
    private String ten;
    private double diemLT;
    private double diemTH;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, double diemLT, double diemTH) {
        this.ma = ma;
        this.ten = ten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public void nhapDuLieu() {
        System.out.print("Nhap ma: ");
        ma = Integer.parseInt(scan.nextLine());
        System.out.print("Nhap ten: ");
        ten = scan.nextLine();
        System.out.print("Nhap diem LT: ");
        diemLT = scan.nextDouble();
        System.out.print("Nhap diem TH: ");
        diemTH = scan.nextDouble();
    }

    public double tinhDiemTB() {
        double lt = getDiemLT();
        double th = getDiemTH();
        return (lt + th * 2) / 3;
    }

    @Override
    public String toString() {
        double tb = tinhDiemTB();
        String res = String.format("%-10d%-20s%-15.2f%-15.2f%-15.2f\n", ma, ten, diemLT, diemTH, tb);
        return res;
    }
}
