/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baiktra;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class QuanLyNhanVien {
    private ArrayList<NhanVien> list = new ArrayList<>();
    
    public QuanLyNhanVien(){
        
    }
    
    public void themNhanVien(NhanVien nv){
        this.list.add(nv);
    }
    
    public void listNhanVien(){
        for(NhanVien nv : list){
            nv.Xuat();
        }
    }
    
    public void tongTienPhaiTra() {
    int tongLuong = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) instanceof NVHanhChinh) {
            NVHanhChinh nvhc = (NVHanhChinh) list.get(i);
            tongLuong += nvhc.tinhLuong();
        } else if (list.get(i) instanceof GiangVien) {
            GiangVien gv = (GiangVien) list.get(i);
            tongLuong += gv.tinhLuong();
        }
    }
        System.out.println("Tổng tiền trung tâm phải trả là: " + tongLuong);
}
    
    public void timKiemNvhc() {
    NVHanhChinh maxLuong = null;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) instanceof NVHanhChinh){
            NVHanhChinh nvhci = (NVHanhChinh) list.get(i);
            if (maxLuong == null || nvhci.tinhLuong() > maxLuong.tinhLuong()) {
                maxLuong = nvhci;
            }
        }
    }
    if (maxLuong != null) {
        System.out.println("Nhân viên hành chính có lương cao nhất là: ");
        maxLuong.Xuat();
    } else {
        System.out.println("Không có nhân viên hành chính nào trong danh sách.");
    }
}
    
  public void timKiemGv() {
    if (list.isEmpty()) {
        System.out.println("Danh sách trống. Không có giảng viên nào.");
        return;
    }

    GiangVien maxLuong = null;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) instanceof GiangVien) {
            GiangVien gv = (GiangVien) list.get(i);
            if (maxLuong == null || gv.tinhLuong() > maxLuong.tinhLuong()) {
                maxLuong = gv;
            }
        }
    }

    if (maxLuong == null) {
        System.out.println("Không có giảng viên nào trong danh sách.");
    } else {
        System.out.println("Giang viên có lương cao nhất là: ");
        maxLuong.Xuat();
    }
}
}

