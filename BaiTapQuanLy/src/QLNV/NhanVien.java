/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baiktra;

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private String hoTen;
    private String gioiTinh;
    private int tuoi;
    private String diaChi;

    public NhanVien(String hoTen, String gioiTinh, int tuoi, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    
    public NhanVien(){
        
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void Xuat(){
       System.out.println("Họ tên: " + hoTen);
       System.out.println("Giới Tính: " + gioiTinh);
       System.out.println("Tuổi: " + tuoi);
       System.out.println("Địa chỉ: " + diaChi);
   }
}
