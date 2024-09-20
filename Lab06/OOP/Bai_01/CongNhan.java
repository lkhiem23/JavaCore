package Bai_01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan() {

    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập Bậc: ");
        bac = sc.nextInt();
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Bậc: " + bac);
    }
}
