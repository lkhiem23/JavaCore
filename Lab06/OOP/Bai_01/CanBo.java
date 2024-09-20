package Bai_01;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {

    }

    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên Cán Bộ: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi Cán Bộ: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập giới tính Cán Bộ: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhập địa chỉ Cán Bộ: ");
    }

    public void hienthi(){
        System.out.println("Họ Tên Cán Bộ: " + hoTen);
        System.out.println("Tuổi của Cán Bộ: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
