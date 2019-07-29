package Bai02;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1, "Nguyen Van A", 4.5, 5.5);
        SinhVien sv2 = new SinhVien(2, "Nguyen Van B", 5.5, 6.5);
        SinhVien sv3 = new SinhVien();
        sv3.nhapDuLieu();
        System.out.printf("%-10s%-20s%-15s%-15s%-15s\n", "Ma", "Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}
