package Bai_01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien() {
        
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập Công Việc: ");
        congViec = sc.nextLine();
    }

    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Công Việc: " + congViec);
    }
}
