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
public class GiangVienCoHuu extends GiangVien {

    private float luongThoaThuan;
    private int soGioQuyDinh = 40;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(float luongThoaThuan, int soGioQuyDinh) {
        this.luongThoaThuan = luongThoaThuan;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public GiangVienCoHuu(float luongThoaThuan, int soGioQuyDinh, String tenGiangVien, 
            String email, String diachi, String dienThoai, float tongLuong, int soGioGiang) {
        
        setTenGiangVien(tenGiangVien);
        setEmail(email);
        setDiachi(diachi);
        setDienThoai(dienThoai);
        setTongLuong(tongLuong);
        setSoGioGiang(soGioGiang);
        //super(tenGiangVien, email, diachi, dienThoai, tongLuong, soGioGiang);
        this.luongThoaThuan = luongThoaThuan;
        this.soGioQuyDinh = soGioQuyDinh;
    }

    @Override
    public GiangVien inputq() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap luong thoa thuan: ");
        this.luongThoaThuan = sc.nextFloat();
        return this;
    }

    @Override
    public void displayq() {
        super.display();
        System.out.println("Luong thoa thuan: " + luongThoaThuan);
        System.out.println("So gio quy dinh: " + soGioQuyDinh);
    }

    @Override
    public void tinhluong() {
        float luong;
        if (getSoGioGiang() > soGioQuyDinh) {
            luong = luongThoaThuan + (getSoGioGiang() - soGioQuyDinh) * 200000;
        } else {
            luong = luongThoaThuan;
        }
        setTongLuong(luong);
    }
}