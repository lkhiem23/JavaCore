/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_bai7;

import java.util.Scanner;

/**
 *
 * @author tung0
 */
public abstract class GiangVien {

    private String tenGiangVien;
    private String email;
    private String diachi;
    private String dienThoai;
    private float tongLuong;
    private int soGioGiang;

    public abstract GiangVien inputq();
    public abstract void displayq();
    public abstract void tinhluong();

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(float tongLuong) {
        this.tongLuong = tongLuong;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }
    
    

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên giảng viên: ");
        tenGiangVien = sc.nextLine();
        System.out.print("Nhập email: ");
        email = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diachi = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        dienThoai = sc.nextLine();
    }

    public void display() {
         System.out.println("Tên giảng viên: " + tenGiangVien);
        System.out.println("Email: " + email);
        System.out.println("Địa chỉ: " + diachi);
        System.out.println("Số điện thoại: " + dienThoai);
        System.out.println("Tổng lương: " + tongLuong);
        System.out.println("Số giờ giảng: " + soGioGiang);
    }
};
